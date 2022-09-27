
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddOnModel {
	
	@Id
	private int addOnId;
	private String addOnName;
	private String addOnDescription;
	private String addAddOnPrice;
	public int getAddOnId() {
		return addOnId;
	}
	public void setAddOnId(int addOnId) {
		this.addOnId = addOnId;
	}
	public String getAddOnName() {
		return addOnName;
	}
	public void setAddOnName(String addOnName) {
		this.addOnName = addOnName;
	}
	public String getAddOnDescription() {
		return addOnDescription;
	}
	public void setAddOnDescription(String addOnDescription) {
		this.addOnDescription = addOnDescription;
	}
	public String getAddAddOnPrice() {
		return addAddOnPrice;
	}
	public void setAddAddOnPrice(String addAddOnPrice) {
		this.addAddOnPrice = addAddOnPrice;
	}
	
	

}
