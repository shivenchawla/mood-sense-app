package moodSense;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.vividsolutions.jts.geom.Point;

@Entity // This tells Hibernate to make a table out of this class
public class HappyUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer uid;

    private String name;

    // @Column(columnDefinition = "coords")
    private Point coords;

    private String coordslabel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Point getCoords() {
		return coords;
	}

	public void setCoords(Point email) {
		this.coords = coords;
	}

  public String getcoordslabel() {
		return coordslabel;
	}

	public void setcoordslabel(String coordslabel) {
		this.coordslabel = coordslabel;
	}


}
