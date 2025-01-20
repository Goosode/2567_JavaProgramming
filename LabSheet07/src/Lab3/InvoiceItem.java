
//=================================== Lab3 ===================================
public class InvoiceItem {
	//======Attribute======
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	
	//======Constructor======
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	
	//======Method======
	public String getId() {
		return this.id;
	}//getId end
	
	public String getDesc() {
		return this.desc;
	}//getDesc end
	
	public int getQty() {
		return this.qty;
	}//getQty end
	
	public void setQty(int qty) {
		this.qty = qty;
	}//setQty end
	
	public double getUnitPrice() {
		return this.unitPrice;
	}//getUnitPrice end
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}//setUnitPrice end
	
	public double getTotal() {
		return this.unitPrice * this.qty;
	}//getTotal end
	
	public String toString() {
		return "InvoiceItem[id=" + this.id + ",desc=" + this.desc + ",qty=" + this.qty + ",unitPrice=" + this.unitPrice + "]";
	}//toString end
}
