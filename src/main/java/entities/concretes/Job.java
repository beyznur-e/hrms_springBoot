package entities.concretes;


import jakarta.persistence.Entity; // Eksik olan import burada tamamlandı
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; // Strateji belirtmek için bu import gerekli
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="JobTitles")
public class Job implements entities.abstracts.Entity{
    @Id //İlgili entity nin uniqe değerini (primary key) tutar.
    @GeneratedValue //İlgili @Id anatasyonun nasıl artacağını belirtmeyi sağlar.
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String jobTitles;

    public Job(){}

    public Job(int id, String jobTitles) {
        this.id = id;
        this.jobTitles = jobTitles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitles() {
        return jobTitles;
    }

    public void setJobTitles(String jobTitles) {
        this.jobTitles = jobTitles;
    }
}
