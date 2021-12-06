import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

    	ItemTypeDAO deo = new ItemTypeDAO();

		List<ItemType> itemTypeList = deo.getAllItemTypes();
		System.out.format("%-5s %-15s %-10s %s\n", "ID", "Name", "Deposit", "Cost per day");
		for (ItemType itemType : itemTypeList) {
			System.out.format("%-5s %-15s %-10s %s\n", itemType.getId(), itemType.getName(), itemType.getDeposit(),
					itemType.getCostPerDay());

		}

	}
}