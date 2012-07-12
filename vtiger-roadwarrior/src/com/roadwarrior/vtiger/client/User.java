/*
 * Copyright (C) 2010 The Android Open Source Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.roadwarrior.vtiger.client;

import android.util.Log;

import org.json.JSONObject;

/**
 * Represents a sample SyncAdapter user
 */
public class User {

    private final String mUserName;
    private final String mFirstName;
    private final String mLastName;
    private final String mCellPhone;
    private final String mOfficePhone;
    private final String mHomePhone;
    private final String mEmail;
    private final String mWebsite;
    private final String mOrganisation;
    private final String mCountry;
    private final String mAddress;
    private final String mCity;
    private final String mRegion;
    private final String mPobox;
    private final String mCodePostal;
    private final String mOtherCountry;
    private final String mOtherAddress;
    private final String mOtherCity;
    private final String mOtherRegion;
    private final String mOtherPobox;
    private final String mOtherCodePostal;
    private final String mIndustry;
    private final String mAnnualRevenue;


    private final boolean mDeleted;
    private final int mUserId;
    
    public String getWebsite() {
        return mWebsite;
    }

    public int getUserId() {
        return mUserId;
    }

    public String getUserName() {
        return mUserName;
    }

    public String getFirstName() {
        return mFirstName;
    }
    public String getOrganisation() {
        return mOrganisation;
    }
    public String getCity() {
        return mCity;
    }
    public String getAddress() {
        return mAddress;
    }
    public String getPostCode() {
        return mCodePostal;
    }    
    
    public String getCountry() {
        return mCountry;
    }
    public String getRegion() {
        return mRegion;
    }
    public String getPobox() {
        return mPobox;
    }

    
    public String getOtherCity() {
        return mOtherCity;
    }
    public String getOtherAddress() {
        return mOtherAddress;
    }
    public String getOtherPostCode() {
        return mOtherCodePostal;
    }    
    
    public String getOtherCountry() {
        return mOtherCountry;
    }
    public String getOtherRegion() {
        return mOtherRegion;
    }
    public String getOtherPobox() {
        return mOtherPobox;
    }

    public String getLastName() {
        return mLastName;
    }

    public String getCellPhone() {
        return mCellPhone;
    }

    public String getOfficePhone() {
        return mOfficePhone;
    }

    public String getHomePhone() {
        return mHomePhone;
    }

    public String getEmail() {
        return mEmail;
    }

    public boolean isDeleted() {
        return mDeleted;
    }

    public User(String name, String firstName, String lastName,
        String cellPhone, String officePhone, String homePhone, String email,String website,String organisation,
        String address,String city,String region,String pobox,String postcode,String country,
        String otheraddress,String othercity,String otherregion,String otherpobox,String otherpostcode,String othercountry,
        String industry,String AnnualRevenue,
        Boolean deleted, Integer userId) {
    	mCodePostal = postcode;
    	mOrganisation = organisation;
    	mCountry = country;
    	mAddress = address;
    	mCity = city;
    	mRegion = region;
    	mPobox = pobox;
    	// shipping address...
    	mOtherAddress = otheraddress;
    	mOtherPobox = otherpobox;
    	mOtherRegion = otherregion;
    	mOtherCity = othercity;
    	mOtherCodePostal = otherpostcode;
    	mOtherCountry = othercountry;
    	mUserName = name;
        mFirstName = firstName;
        mLastName = lastName;
        mCellPhone = cellPhone;
        mOfficePhone = officePhone;
        mHomePhone = homePhone;
        mIndustry = industry;
        mAnnualRevenue = AnnualRevenue;
        mEmail = email;
        mWebsite = website;
        mDeleted = deleted;
        mUserId = userId;
        
    }

    /**
     * Creates and returns an instance of the user from the provided JSON data.
     * 
     * @param user The JSONObject containing user data
     * @return user The new instance of Voiper user created from the JSON data.
     */
    public static User valueOf(JSONObject user) {
        try {
            final String firstName = user.has("firstname") ? user.getString("firstname") : null;
            final String lastName = user.has("lastname") ? user.getString("lastname") : null;
            final String cellPhone = user.has("mobile") ? user.getString("mobile") : null;
            final String officePhone =
                user.has("o") ? user.getString("o") : null;
            final String homePhone = user.has("homephone") ? user.getString("homephone") : null;
           
            final String email = user.has("email") ? user.getString("email") : null;
            final String website = user.has("website") ? user.getString("website") : null;
             //  ACCOUNTS
            final String organisation = user.has("accountname") ? user.getString("accountname") : null;
            final String Phone = user.has("phone") ? user.getString("phone") : null;
            // FIXME: gerer ship et bill address
            final String address = user.has("bill_street") ? user.getString("bill_street") : null;
            final String country = user.has("bill_country") ? user.getString("bill_country") : null;
            final String city = user.has("bill_city") ? user.getString("bill_city") : null;
            final String region = user.has("bill_state") ? user.getString("bill_state") : null;
            final String pobox = user.has("bill_pobox") ? user.getString("bill_pobox") : null;
            final String postcode = user.has("bill_code") ? user.getString("bill_code") : null;
            final String ship_address = user.has("ship_street") ? user.getString("ship_street") : null;
            final String ship_country = user.has("ship_country") ? user.getString("ship_country") : null;
            final String ship_city = user.has("ship_city") ? user.getString("ship_city") : null;
            final String ship_region = user.has("ship_state") ? user.getString("ship_state") : null;
            final String ship_pobox = user.has("ship_pobox") ? user.getString("ship_pobox") : null;
            final String ship_postcode = user.has("ship_code") ? user.getString("ship_code") : null;
            final String industry = user.has("industry") ? user.getString("industry") : null;
            final String annual_revenue = user.has("annual_revenue") ? user.getString("annual_revenue") : null;

            final boolean deleted =
                user.has("d") ? user.getBoolean("d") : false;
            
            int userId = 1;
            final String contact_no = user.has("contact_no") ? user.getString("contact_no") : null;
            if (contact_no != null){
            Log.i("User", contact_no);
            Log.i("User", contact_no.substring(3));
            userId = Integer.parseInt(contact_no.substring(3));
            return new User("serName", firstName, lastName, cellPhone,
                    officePhone, homePhone, email,website, organisation,address,city,region,pobox,postcode,country,
                    ship_address,ship_city,ship_region,ship_pobox,ship_postcode,ship_country,
                    industry,annual_revenue,
                    deleted, userId);

            }
            
            
            final String lead_no = user.has("lead_no") ? user.getString("lead_no") : null;
            if (lead_no != null){
            Log.i("User","lead "+ lead_no);
            Log.i("User", lead_no.substring(3));
            userId = Integer.parseInt(lead_no.substring(3)) | 0x80000;
            return new User("serName", firstName, lastName, cellPhone,
                    officePhone, Phone, email,website, organisation,
                    address,city,region,pobox,postcode,country,
                    ship_address,ship_city,ship_region,ship_pobox,ship_postcode,ship_country,
                    industry,annual_revenue,

                    deleted, userId);

            }
            final String account_no = user.has("account_no") ? user.getString("account_no") : null;
            if (account_no != null){
            Log.i("User","account "+ account_no);
            Log.i("User", account_no.substring(3));
            userId = Integer.parseInt(account_no.substring(3)) | 0x90000;
            return new User("serName", firstName, lastName, cellPhone,
                    officePhone, homePhone, email,website, organisation,
                    address,city,region,pobox,postcode,country,
                    ship_address,ship_city,ship_region,ship_pobox,ship_postcode,ship_country,
                    industry,annual_revenue,

                    deleted, userId);

            }
        } catch (final Exception ex) {
            Log.i("User", "Error parsing JSON user object" + ex.toString());

        }
        return null;

    }

    /**
     * Represents the User's status messages
     * 
     */
    public static class Status {
        private final Integer mUserId;
        private final String mStatus;

        public int getUserId() {
            return mUserId;
        }

        public String getStatus() {
            return mStatus;
        }

        public Status(Integer userId, String status) {
            mUserId = userId;
            mStatus = status;
        }

        public static User.Status valueOf(JSONObject userStatus) {
            try {
                final int userId = userStatus.getInt("i");
                final String status = userStatus.getString("s");
                return new User.Status(userId, status);
            } catch (final Exception ex) {
                Log.i("User.Status", "Error parsing JSON user object");
            }
            return null;
        }
    }

}
