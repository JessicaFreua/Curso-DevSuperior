package entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private Long id;
	private Double latitude;
	private Double longitute;
	private Instant moment;
	private OrderStatus status;
	
	private List<Product> products = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitute() {
		return longitute;
	}

	public void setLongitute(Double longitute) {
		this.longitute = longitute;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", latitude=" + latitude + ", longitute=" + longitute + ", moment=" + moment
				+ ", status=" + status + ", products=" + products + "]";
	}

	
	

}
