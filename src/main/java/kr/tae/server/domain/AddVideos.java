package kr.tae.server.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Videos")
public class AddVideos implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "LONGTEXT")
    private String url;

    @Column(columnDefinition = "TINYTEXT")
    private String creator;

    @Column(columnDefinition = "TINYTEXT")
    private String recommender;

    @Column(columnDefinition = "SMALLINT")
    private Short length;

    private Integer youtubeTotalViews;

    private String preferSex;

    private String preferAge;

    @Column(columnDefinition = "LONGTEXT")
   private String description;

    protected AddVideos() {
    }

    public AddVideos(String title, String url, String creator, String recommender, Short length,
                     Integer youtubeTotalViews, String preferSex, String preferAge, String description) {
        this.title = title;
        this.url = url;
        this.creator = creator;
        this. recommender = recommender;
        this. length = length;
        this. youtubeTotalViews = youtubeTotalViews;
        this.preferSex = preferSex;
        this.preferAge = preferAge;
        this.description = description;
    }

    /** 해당 데이터를 보여주기 위한 용도 */

    public Long getId() {return id;}
    public String getTitle() {return title;}
    public String getUrl() {return url;}
    public String getCreator() {return creator;}
    public String getRecommender() {return recommender;}
    public Short getLength() {return length;}
    public Integer getYoutubeTotalViews() {return youtubeTotalViews;}
    public String getPreferSex() {return preferSex;}
    public String getPreferAge() {return preferAge;}
    public String getDescription() {return description;}

    /** 해당 데이터를 개별적으로 수정하기 위한 용도 */

    public void setTitle(String title) {this.title = title;}
    public void setUrl(String url) {this.url = url;}
    public void setCreator(String creator) {this.creator = creator;}
    public void setRecommender(String recommender) {this.recommender = recommender;}
    public void setLength(Short length) {this.length = length;}
    public void setYoutubeTotalViews(Integer youtubeTotalViews) {this.youtubeTotalViews = youtubeTotalViews;}
    public void setPreferSex(String preferSex) {this.preferSex = preferSex;}
    public void setPreferAge(String preferAge) {this.preferAge = preferAge;}
    public void setDescription(String description) {this.description = description;}

}