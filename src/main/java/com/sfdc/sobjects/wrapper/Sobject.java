package com.sfdc.sobjects.wrapper;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sobject {

    @SerializedName("activateable")
    @Expose
    private Boolean activateable;
    @SerializedName("createable")
    @Expose
    private Boolean createable;
    @SerializedName("custom")
    @Expose
    private Boolean custom;
    @SerializedName("customSetting")
    @Expose
    private Boolean customSetting;
    @SerializedName("deletable")
    @Expose
    private Boolean deletable;
    @SerializedName("deprecatedAndHidden")
    @Expose
    private Boolean deprecatedAndHidden;
    @SerializedName("feedEnabled")
    @Expose
    private Boolean feedEnabled;
    @SerializedName("hasSubtypes")
    @Expose
    private Boolean hasSubtypes;
    @SerializedName("isSubtype")
    @Expose
    private Boolean isSubtype;
    @SerializedName("keyPrefix")
    @Expose
    private String keyPrefix;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("labelPlural")
    @Expose
    private String labelPlural;
    @SerializedName("layoutable")
    @Expose
    private Boolean layoutable;
    @SerializedName("mergeable")
    @Expose
    private Boolean mergeable;
    @SerializedName("mruEnabled")
    @Expose
    private Boolean mruEnabled;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("queryable")
    @Expose
    private Boolean queryable;
    @SerializedName("replicateable")
    @Expose
    private Boolean replicateable;
    @SerializedName("retrieveable")
    @Expose
    private Boolean retrieveable;
    @SerializedName("searchable")
    @Expose
    private Boolean searchable;
    @SerializedName("triggerable")
    @Expose
    private Boolean triggerable;
    @SerializedName("undeletable")
    @Expose
    private Boolean undeletable;
    @SerializedName("updateable")
    @Expose
    private Boolean updateable;
    @SerializedName("urls")
    @Expose
    private Urls urls;

    public Boolean getActivateable() {
        return activateable;
    }

    public void setActivateable(Boolean activateable) {
        this.activateable = activateable;
    }

    public Boolean getCreateable() {
        return createable;
    }

    public void setCreateable(Boolean createable) {
        this.createable = createable;
    }

    public Boolean getCustom() {
        return custom;
    }

    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    public Boolean getCustomSetting() {
        return customSetting;
    }

    public void setCustomSetting(Boolean customSetting) {
        this.customSetting = customSetting;
    }

    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    public Boolean getDeprecatedAndHidden() {
        return deprecatedAndHidden;
    }

    public void setDeprecatedAndHidden(Boolean deprecatedAndHidden) {
        this.deprecatedAndHidden = deprecatedAndHidden;
    }

    public Boolean getFeedEnabled() {
        return feedEnabled;
    }

    public void setFeedEnabled(Boolean feedEnabled) {
        this.feedEnabled = feedEnabled;
    }

    public Boolean getHasSubtypes() {
        return hasSubtypes;
    }

    public void setHasSubtypes(Boolean hasSubtypes) {
        this.hasSubtypes = hasSubtypes;
    }

    public Boolean getIsSubtype() {
        return isSubtype;
    }

    public void setIsSubtype(Boolean isSubtype) {
        this.isSubtype = isSubtype;
    }

    public String getKeyPrefix() {
        return keyPrefix;
    }

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabelPlural() {
        return labelPlural;
    }

    public void setLabelPlural(String labelPlural) {
        this.labelPlural = labelPlural;
    }

    public Boolean getLayoutable() {
        return layoutable;
    }

    public void setLayoutable(Boolean layoutable) {
        this.layoutable = layoutable;
    }

    public Boolean getMergeable() {
        return mergeable;
    }

    public void setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
    }

    public Boolean getMruEnabled() {
        return mruEnabled;
    }

    public void setMruEnabled(Boolean mruEnabled) {
        this.mruEnabled = mruEnabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getQueryable() {
        return queryable;
    }

    public void setQueryable(Boolean queryable) {
        this.queryable = queryable;
    }

    public Boolean getReplicateable() {
        return replicateable;
    }

    public void setReplicateable(Boolean replicateable) {
        this.replicateable = replicateable;
    }

    public Boolean getRetrieveable() {
        return retrieveable;
    }

    public void setRetrieveable(Boolean retrieveable) {
        this.retrieveable = retrieveable;
    }

    public Boolean getSearchable() {
        return searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public Boolean getTriggerable() {
        return triggerable;
    }

    public void setTriggerable(Boolean triggerable) {
        this.triggerable = triggerable;
    }

    public Boolean getUndeletable() {
        return undeletable;
    }

    public void setUndeletable(Boolean undeletable) {
        this.undeletable = undeletable;
    }

    public Boolean getUpdateable() {
        return updateable;
    }

    public void setUpdateable(Boolean updateable) {
        this.updateable = updateable;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobject .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activateable");
        sb.append('=');
        sb.append(((this.activateable == null)?"<null>":this.activateable));
        sb.append(',');
        sb.append("createable");
        sb.append('=');
        sb.append(((this.createable == null)?"<null>":this.createable));
        sb.append(',');
        sb.append("custom");
        sb.append('=');
        sb.append(((this.custom == null)?"<null>":this.custom));
        sb.append(',');
        sb.append("customSetting");
        sb.append('=');
        sb.append(((this.customSetting == null)?"<null>":this.customSetting));
        sb.append(',');
        sb.append("deletable");
        sb.append('=');
        sb.append(((this.deletable == null)?"<null>":this.deletable));
        sb.append(',');
        sb.append("deprecatedAndHidden");
        sb.append('=');
        sb.append(((this.deprecatedAndHidden == null)?"<null>":this.deprecatedAndHidden));
        sb.append(',');
        sb.append("feedEnabled");
        sb.append('=');
        sb.append(((this.feedEnabled == null)?"<null>":this.feedEnabled));
        sb.append(',');
        sb.append("hasSubtypes");
        sb.append('=');
        sb.append(((this.hasSubtypes == null)?"<null>":this.hasSubtypes));
        sb.append(',');
        sb.append("isSubtype");
        sb.append('=');
        sb.append(((this.isSubtype == null)?"<null>":this.isSubtype));
        sb.append(',');
        sb.append("keyPrefix");
        sb.append('=');
        sb.append(((this.keyPrefix == null)?"<null>":this.keyPrefix));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("labelPlural");
        sb.append('=');
        sb.append(((this.labelPlural == null)?"<null>":this.labelPlural));
        sb.append(',');
        sb.append("layoutable");
        sb.append('=');
        sb.append(((this.layoutable == null)?"<null>":this.layoutable));
        sb.append(',');
        sb.append("mergeable");
        sb.append('=');
        sb.append(((this.mergeable == null)?"<null>":this.mergeable));
        sb.append(',');
        sb.append("mruEnabled");
        sb.append('=');
        sb.append(((this.mruEnabled == null)?"<null>":this.mruEnabled));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("queryable");
        sb.append('=');
        sb.append(((this.queryable == null)?"<null>":this.queryable));
        sb.append(',');
        sb.append("replicateable");
        sb.append('=');
        sb.append(((this.replicateable == null)?"<null>":this.replicateable));
        sb.append(',');
        sb.append("retrieveable");
        sb.append('=');
        sb.append(((this.retrieveable == null)?"<null>":this.retrieveable));
        sb.append(',');
        sb.append("searchable");
        sb.append('=');
        sb.append(((this.searchable == null)?"<null>":this.searchable));
        sb.append(',');
        sb.append("triggerable");
        sb.append('=');
        sb.append(((this.triggerable == null)?"<null>":this.triggerable));
        sb.append(',');
        sb.append("undeletable");
        sb.append('=');
        sb.append(((this.undeletable == null)?"<null>":this.undeletable));
        sb.append(',');
        sb.append("updateable");
        sb.append('=');
        sb.append(((this.updateable == null)?"<null>":this.updateable));
        sb.append(',');
        sb.append("urls");
        sb.append('=');
        sb.append(((this.urls == null)?"<null>":this.urls));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    
}
