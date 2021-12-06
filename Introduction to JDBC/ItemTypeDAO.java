import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class ItemTypeDAO {
    public List<ItemType> getAllItemTypes() throws Exception {
    	List<ItemType> itemTypeList = new ArrayList<>();

		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from item_type");
		while (rs.next()) {
			Long id = rs.getLong(1);
			String name = rs.getString(2);
			Double deposit = rs.getDouble(3);
			Double costPerDay = rs.getDouble(4);

			ItemType itemType = new ItemType(id, name, deposit, costPerDay);
			itemTypeList.add(itemType);
		}
		rs.close();
		stmt.close();
		con.close();
		return itemTypeList;
	}
}