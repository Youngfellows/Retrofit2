package com.ssdj.retrofit2.bean;

/**
 * @author 陈  杰
 * @version $Rev$
 * @time 2017/2/21 14:17
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class MobileAddress
{
    /**
     * result : {"zip":"300000","province":"天津","city":"","company":"联通","areacode":"022","card":""}
     * reason : Return Successd!
     * error_code : 0
     * resultcode : 200
     */
    public ResultEntity result;
    public String reason;
    public int error_code;
    public String resultcode;

    public static class ResultEntity
    {
        /**
         * zip : 300000
         * province : 天津
         * city :
         * company : 联通
         * areacode : 022
         * card :
         */
        public String zip;
        public String province;
        public String city;
        public String company;
        public String areacode;
        public String card;

        public String getZip()
        {
            return zip;
        }

        public void setZip(String zip)
        {
            this.zip = zip;
        }

        public String getProvince()
        {
            return province;
        }

        public void setProvince(String province)
        {
            this.province = province;
        }

        public String getCity()
        {
            return city;
        }

        public void setCity(String city)
        {
            this.city = city;
        }

        public String getCompany()
        {
            return company;
        }

        public void setCompany(String company)
        {
            this.company = company;
        }

        public String getAreacode()
        {
            return areacode;
        }

        public void setAreacode(String areacode)
        {
            this.areacode = areacode;
        }

        public String getCard()
        {
            return card;
        }

        public void setCard(String card)
        {
            this.card = card;
        }
    }

    public ResultEntity getResult()
    {
        return result;
    }

    public void setResult(ResultEntity result)
    {
        this.result = result;
    }

    public String getReason()
    {
        return reason;
    }

    public void setReason(String reason)
    {
        this.reason = reason;
    }

    public int getError_code()
    {
        return error_code;
    }

    public void setError_code(int error_code)
    {
        this.error_code = error_code;
    }

    public String getResultcode()
    {
        return resultcode;
    }

    public void setResultcode(String resultcode)
    {
        this.resultcode = resultcode;
    }
}
