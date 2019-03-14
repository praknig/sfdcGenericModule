package com.sfdc.fields.wrappers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Urls {

    @SerializedName("layout")
    @Expose
    private String layout;

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Urls.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("layout");
        sb.append('=');
        sb.append(((this.layout == null)?"<null>":this.layout));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.layout == null)? 0 :this.layout.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Urls) == false) {
            return false;
        }
        Urls rhs = ((Urls) other);
        return ((this.layout == rhs.layout)||((this.layout!= null)&&this.layout.equals(rhs.layout)));
    }

}
