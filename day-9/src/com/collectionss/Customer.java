package com.collectionss;

public class Customer {
	// TODO Auto-generated method stub

	int cid;
	String cname;
	int accno;
	String cadd;

	public Customer(int cid, String cname, int accno, String cadd) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.accno = accno;
		this.cadd = cadd;
	}

	public int ComparatorClass(Object o) {
		Customer s = (Customer) o;
		if (this.accno < s.accno)// s2.sid < s1.sid
		{
			return -1;
		} else {
			return 1;
		}

	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", accno=" + accno + ", cadd=" + cadd + "]";
	}

	


}
