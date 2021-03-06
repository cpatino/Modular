package com.carpco.modular.data.model.location;

import org.joda.time.DateTime;

import com.carpco.modular.data.model.DefaultTableModel;
import com.carpco.modular.data.model.administration.Company;

/**
 * Company address is a model from database table.
 * 
 * It contains all address linked to a company.
 * 
 * @author Carlos Rodriguez
 * 
 */
public class CompanyAddress extends DefaultTableModel {
  
  /**
   * Company linked to address
   */
  private Company company;

  /**
   * Flag to identify if it is the default client address.
   */
  private boolean defaultAddress;

  /**
   * Phone 1 from company address
   */
  private String phone1;

  /**
   * Phone 2 from company address
   */
  private String phone2;

  /**
   * City where the company is located
   */
  private City city;

  /**
   * {@link CompanyAddress} constructor
   * 
   * @param name Address
   * @param phone1 Phone line
   * @param company Company linked to address
   * @param city City linked to address
   */
  public CompanyAddress(String name, String phone1, Company company, City city) {
    super();
    this.name = name;
    this.phone1 = phone1;
    this.company = company;
    this.city = city;
  }
  
  /**
   * {@link CompanyAddress} constructor
   * 
   * @param identifier Address identifier
   * @param code Address code 
   * @param name Address
   * @param dtCreation Record's creation date
   * @param dtLastUpdate Record's last update date
   * @param enabled Flag to identify if record is enabled or disabled
   * @param company Company linked to address
   * @param defaultAddress Flag to identify if address is the company default address
   * @param phone1 Phone line
   * @param phone2 Phone line
   * @param city City linked to address
   */
  public CompanyAddress(int identifier, String code, String name, DateTime dtCreation,
      DateTime dtLastUpdate, boolean enabled, Company company, boolean defaultAddress,
      String phone1, String phone2, City city) {
    super(identifier, code, name, dtCreation, dtLastUpdate, enabled);
    this.company = company;
    this.defaultAddress = defaultAddress;
    this.phone1 = phone1;
    this.phone2 = phone2;
    this.city = city;
  }

  /**
   * @return the company
   */
  public Company getCompany() {
    return company;
  }

  /**
   * @param company the company to set
   */
  public void setCompany(Company company) {
    this.company = company;
  }

  /**
   * @return the defaultAddress
   */
  public boolean isDefaultAddress() {
    return defaultAddress;
  }

  /**
   * @param defaultAddress the defaultAddress to set
   */
  public void setDefaultAddress(boolean defaultAddress) {
    this.defaultAddress = defaultAddress;
  }

  /**
   * @return the city
   */
  public City getCity() {
    return city;
  }

  /**
   * @param city the city to set
   */
  public void setCity(City city) {
    this.city = city;
  }

  /**
   * @return the phone1
   */
  public String getPhone1() {
    return phone1;
  }

  /**
   * @param phone1 the phone1 to set
   */
  public void setPhone1(String phone1) {
    this.phone1 = phone1;
  }

  /**
   * @return the phone2
   */
  public String getPhone2() {
    return phone2;
  }

  /**
   * @param phone2 the phone2 to set
   */
  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "CompanyAddress [company=" + company + ", defaultAddress=" + defaultAddress
        + ", phone1=" + phone1 + ", phone2=" + phone2 + ", city=" + city + ", identifier="
        + identifier + ", code=" + code + ", name=" + name + ", dtCreation=" + dtCreation
        + ", dtLastUpdate=" + dtLastUpdate + ", enabled=" + enabled + "]";
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((city == null) ? 0 : city.hashCode());
    result = prime * result + ((company == null) ? 0 : company.hashCode());
    result = prime * result + (defaultAddress ? 1231 : 1237);
    result = prime * result + ((phone1 == null) ? 0 : phone1.hashCode());
    result = prime * result + ((phone2 == null) ? 0 : phone2.hashCode());
    return result;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (!(obj instanceof CompanyAddress))
      return false;
    CompanyAddress other = (CompanyAddress) obj;
    if (city == null) {
      if (other.city != null)
        return false;
    } else if (!city.equals(other.city))
      return false;
    if (company == null) {
      if (other.company != null)
        return false;
    } else if (!company.equals(other.company))
      return false;
    if (defaultAddress != other.defaultAddress)
      return false;
    if (phone1 == null) {
      if (other.phone1 != null)
        return false;
    } else if (!phone1.equals(other.phone1))
      return false;
    if (phone2 == null) {
      if (other.phone2 != null)
        return false;
    } else if (!phone2.equals(other.phone2))
      return false;
    return true;
  }

}
