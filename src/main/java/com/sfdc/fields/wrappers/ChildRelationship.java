package com.sfdc.fields.wrappers;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChildRelationship {

    @SerializedName("cascadeDelete")
    @Expose
    private Boolean cascadeDelete;
    @SerializedName("childSObject")
    @Expose
    private String childSObject;
    @SerializedName("deprecatedAndHidden")
    @Expose
    private Boolean deprecatedAndHidden;
    @SerializedName("field")
    @Expose
    private String field;
    @SerializedName("junctionIdListNames")
    @Expose
    private List<Object> junctionIdListNames = new ArrayList<Object>();
    @SerializedName("junctionReferenceTo")
    @Expose
    private List<Object> junctionReferenceTo = new ArrayList<Object>();
    @SerializedName("relationshipName")
    @Expose
    private String relationshipName;
    @SerializedName("restrictedDelete")
    @Expose
    private Boolean restrictedDelete;

    public Boolean getCascadeDelete() {
        return cascadeDelete;
    }

    public void setCascadeDelete(Boolean cascadeDelete) {
        this.cascadeDelete = cascadeDelete;
    }

    public String getChildSObject() {
        return childSObject;
    }

    public void setChildSObject(String childSObject) {
        this.childSObject = childSObject;
    }

    public Boolean getDeprecatedAndHidden() {
        return deprecatedAndHidden;
    }

    public void setDeprecatedAndHidden(Boolean deprecatedAndHidden) {
        this.deprecatedAndHidden = deprecatedAndHidden;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<Object> getJunctionIdListNames() {
        return junctionIdListNames;
    }

    public void setJunctionIdListNames(List<Object> junctionIdListNames) {
        this.junctionIdListNames = junctionIdListNames;
    }

    public List<Object> getJunctionReferenceTo() {
        return junctionReferenceTo;
    }

    public void setJunctionReferenceTo(List<Object> junctionReferenceTo) {
        this.junctionReferenceTo = junctionReferenceTo;
    }

    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }

    public Boolean getRestrictedDelete() {
        return restrictedDelete;
    }

    public void setRestrictedDelete(Boolean restrictedDelete) {
        this.restrictedDelete = restrictedDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChildRelationship.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cascadeDelete");
        sb.append('=');
        sb.append(((this.cascadeDelete == null)?"<null>":this.cascadeDelete));
        sb.append(',');
        sb.append("childSObject");
        sb.append('=');
        sb.append(((this.childSObject == null)?"<null>":this.childSObject));
        sb.append(',');
        sb.append("deprecatedAndHidden");
        sb.append('=');
        sb.append(((this.deprecatedAndHidden == null)?"<null>":this.deprecatedAndHidden));
        sb.append(',');
        sb.append("field");
        sb.append('=');
        sb.append(((this.field == null)?"<null>":this.field));
        sb.append(',');
        sb.append("junctionIdListNames");
        sb.append('=');
        sb.append(((this.junctionIdListNames == null)?"<null>":this.junctionIdListNames));
        sb.append(',');
        sb.append("junctionReferenceTo");
        sb.append('=');
        sb.append(((this.junctionReferenceTo == null)?"<null>":this.junctionReferenceTo));
        sb.append(',');
        sb.append("relationshipName");
        sb.append('=');
        sb.append(((this.relationshipName == null)?"<null>":this.relationshipName));
        sb.append(',');
        sb.append("restrictedDelete");
        sb.append('=');
        sb.append(((this.restrictedDelete == null)?"<null>":this.restrictedDelete));
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
        result = ((result* 31)+((this.relationshipName == null)? 0 :this.relationshipName.hashCode()));
        result = ((result* 31)+((this.field == null)? 0 :this.field.hashCode()));
        result = ((result* 31)+((this.deprecatedAndHidden == null)? 0 :this.deprecatedAndHidden.hashCode()));
        result = ((result* 31)+((this.junctionReferenceTo == null)? 0 :this.junctionReferenceTo.hashCode()));
        result = ((result* 31)+((this.junctionIdListNames == null)? 0 :this.junctionIdListNames.hashCode()));
        result = ((result* 31)+((this.childSObject == null)? 0 :this.childSObject.hashCode()));
        result = ((result* 31)+((this.cascadeDelete == null)? 0 :this.cascadeDelete.hashCode()));
        result = ((result* 31)+((this.restrictedDelete == null)? 0 :this.restrictedDelete.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChildRelationship) == false) {
            return false;
        }
        ChildRelationship rhs = ((ChildRelationship) other);
        return (((((((((this.relationshipName == rhs.relationshipName)||((this.relationshipName!= null)&&this.relationshipName.equals(rhs.relationshipName)))&&((this.field == rhs.field)||((this.field!= null)&&this.field.equals(rhs.field))))&&((this.deprecatedAndHidden == rhs.deprecatedAndHidden)||((this.deprecatedAndHidden!= null)&&this.deprecatedAndHidden.equals(rhs.deprecatedAndHidden))))&&((this.junctionReferenceTo == rhs.junctionReferenceTo)||((this.junctionReferenceTo!= null)&&this.junctionReferenceTo.equals(rhs.junctionReferenceTo))))&&((this.junctionIdListNames == rhs.junctionIdListNames)||((this.junctionIdListNames!= null)&&this.junctionIdListNames.equals(rhs.junctionIdListNames))))&&((this.childSObject == rhs.childSObject)||((this.childSObject!= null)&&this.childSObject.equals(rhs.childSObject))))&&((this.cascadeDelete == rhs.cascadeDelete)||((this.cascadeDelete!= null)&&this.cascadeDelete.equals(rhs.cascadeDelete))))&&((this.restrictedDelete == rhs.restrictedDelete)||((this.restrictedDelete!= null)&&this.restrictedDelete.equals(rhs.restrictedDelete))));
    }

}
