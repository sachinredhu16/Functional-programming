package N_ComparatorExample;

public class Address {
    public int flatNo;
    public String societyName;
    public String city;

    @Override
    public String toString() {
        return "Address{" +
                "flatNo=" + flatNo +
                ", societyName='" + societyName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Address(int flatNo, String societyName, String city) {
        this.flatNo = flatNo;
        this.societyName = societyName;
        this.city = city;
    }
}
