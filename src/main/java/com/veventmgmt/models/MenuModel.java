
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MenuModel {
	
	@Id
	private int foodMenuId;
	private String foodMenuType;
	private String foodMenuItems;
	private String foodMenuCost;
	public int getFoodMenuId() {
		return foodMenuId;
	}
	public void setFoodMenuId(int foodMenuId) {
		this.foodMenuId = foodMenuId;
	}
	public String getFoodMenuType() {
		return foodMenuType;
	}
	public void setFoodMenuType(String foodMenuType) {
		this.foodMenuType = foodMenuType;
	}
	public String getFoodMenuItems() {
		return foodMenuItems;
	}
	public void setFoodMenuItems(String foodMenuItems) {
		this.foodMenuItems = foodMenuItems;
	}
	public String getFoodMenuCost() {
		return foodMenuCost;
	}
	public void setFoodMenuCost(String foodMenuCost) {
		this.foodMenuCost = foodMenuCost;
	}
	
	
	
	
	
}
