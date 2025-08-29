package com.nt.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="JPA_DealersVCL_Tab1")
public class Dealer {
    @Id
    @Column(name="dealer_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="dealer_Name")
    private String name;
    
    @Column(name="dealer_Email")
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name="dealer_SubscriptionType")
    private SubscriptionType subscriptionType;
    
    //ALLArgsConstructor...
	public Dealer(Long id, String name, String email, SubscriptionType subscriptionType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.subscriptionType = subscriptionType;
	}
    
	//Require ArgsConstructor...
	public Dealer(String name, String email, SubscriptionType subscriptionType) {
		super();
		this.name = name;
		this.email = email;
		this.subscriptionType = subscriptionType;
	}
	
	//NoArgConstructor...
		public Dealer() {  }

		
		//Getter Methods...
		public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getEmail() {
			return email;
		}

		public SubscriptionType getSubscriptionType() {
			return subscriptionType;
		}

		//Setter Methods...
		public void setId(Long id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setSubscriptionType(SubscriptionType subscriptionType) {
			this.subscriptionType = subscriptionType;
		}

		
		//ToString Method...
		@Override
		public String toString() {
			return "Dealer [id=" + id + ", "
					+ "name=" + name + ", "
					+ "email=" + email + ", "
					+ "subscriptionType=" + subscriptionType +"]";
		}
		
}
