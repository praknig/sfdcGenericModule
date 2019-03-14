package com.sfdc.fields.wrappers;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fields {

    @SerializedName("actionOverrides")
    @Expose
    private List<Object> actionOverrides = new ArrayList<Object>();
    @SerializedName("activateable")
    @Expose
    private Boolean activateable;
    @SerializedName("childRelationships")
    @Expose
    private List<ChildRelationship> childRelationships = new ArrayList<ChildRelationship>();
    @SerializedName("compactLayoutable")
    @Expose
    private Boolean compactLayoutable;
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
    @SerializedName("fields")
    @Expose
    private List<Field> fields = new ArrayList<Field>();
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
    @SerializedName("listviewable")
    @Expose
    private Object listviewable;
    @SerializedName("lookupLayoutable")
    @Expose
    private Object lookupLayoutable;
    @SerializedName("mergeable")
    @Expose
    private Boolean mergeable;
    @SerializedName("mruEnabled")
    @Expose
    private Boolean mruEnabled;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("namedLayoutInfos")
    @Expose
    private List<Object> namedLayoutInfos = new ArrayList<Object>();
    @SerializedName("networkScopeFieldName")
    @Expose
    private Object networkScopeFieldName;
    @SerializedName("queryable")
    @Expose
    private Boolean queryable;
    @SerializedName("recordTypeInfos")
    @Expose
    private List<RecordTypeInfo> recordTypeInfos = new ArrayList<RecordTypeInfo>();
    @SerializedName("replicateable")
    @Expose
    private Boolean replicateable;
    @SerializedName("retrieveable")
    @Expose
    private Boolean retrieveable;
    @SerializedName("searchLayoutable")
    @Expose
    private Boolean searchLayoutable;
    @SerializedName("searchable")
    @Expose
    private Boolean searchable;
    @SerializedName("supportedScopes")
    @Expose
    private List<SupportedScope> supportedScopes = new ArrayList<SupportedScope>();
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
    private Urls__1 urls;

    public List<Object> getActionOverrides() {
        return actionOverrides;
    }

    public void setActionOverrides(List<Object> actionOverrides) {
        this.actionOverrides = actionOverrides;
    }

    public Boolean getActivateable() {
        return activateable;
    }

    public void setActivateable(Boolean activateable) {
        this.activateable = activateable;
    }

    public List<ChildRelationship> getChildRelationships() {
        return childRelationships;
    }

    public void setChildRelationships(List<ChildRelationship> childRelationships) {
        this.childRelationships = childRelationships;
    }

    public Boolean getCompactLayoutable() {
        return compactLayoutable;
    }

    public void setCompactLayoutable(Boolean compactLayoutable) {
        this.compactLayoutable = compactLayoutable;
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

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
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

    public Object getListviewable() {
        return listviewable;
    }

    public void setListviewable(Object listviewable) {
        this.listviewable = listviewable;
    }

    public Object getLookupLayoutable() {
        return lookupLayoutable;
    }

    public void setLookupLayoutable(Object lookupLayoutable) {
        this.lookupLayoutable = lookupLayoutable;
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

    public List<Object> getNamedLayoutInfos() {
        return namedLayoutInfos;
    }

    public void setNamedLayoutInfos(List<Object> namedLayoutInfos) {
        this.namedLayoutInfos = namedLayoutInfos;
    }

    public Object getNetworkScopeFieldName() {
        return networkScopeFieldName;
    }

    public void setNetworkScopeFieldName(Object networkScopeFieldName) {
        this.networkScopeFieldName = networkScopeFieldName;
    }

    public Boolean getQueryable() {
        return queryable;
    }

    public void setQueryable(Boolean queryable) {
        this.queryable = queryable;
    }

    public List<RecordTypeInfo> getRecordTypeInfos() {
        return recordTypeInfos;
    }

    public void setRecordTypeInfos(List<RecordTypeInfo> recordTypeInfos) {
        this.recordTypeInfos = recordTypeInfos;
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

    public Boolean getSearchLayoutable() {
        return searchLayoutable;
    }

    public void setSearchLayoutable(Boolean searchLayoutable) {
        this.searchLayoutable = searchLayoutable;
    }

    public Boolean getSearchable() {
        return searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public List<SupportedScope> getSupportedScopes() {
        return supportedScopes;
    }

    public void setSupportedScopes(List<SupportedScope> supportedScopes) {
        this.supportedScopes = supportedScopes;
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

    public Urls__1 getUrls() {
        return urls;
    }

    public void setUrls(Urls__1 urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fields.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actionOverrides");
        sb.append('=');
        sb.append(((this.actionOverrides == null)?"<null>":this.actionOverrides));
        sb.append(',');
        sb.append("activateable");
        sb.append('=');
        sb.append(((this.activateable == null)?"<null>":this.activateable));
        sb.append(',');
        sb.append("childRelationships");
        sb.append('=');
        sb.append(((this.childRelationships == null)?"<null>":this.childRelationships));
        sb.append(',');
        sb.append("compactLayoutable");
        sb.append('=');
        sb.append(((this.compactLayoutable == null)?"<null>":this.compactLayoutable));
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
        sb.append("fields");
        sb.append('=');
        sb.append(((this.fields == null)?"<null>":this.fields));
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
        sb.append("listviewable");
        sb.append('=');
        sb.append(((this.listviewable == null)?"<null>":this.listviewable));
        sb.append(',');
        sb.append("lookupLayoutable");
        sb.append('=');
        sb.append(((this.lookupLayoutable == null)?"<null>":this.lookupLayoutable));
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
        sb.append("namedLayoutInfos");
        sb.append('=');
        sb.append(((this.namedLayoutInfos == null)?"<null>":this.namedLayoutInfos));
        sb.append(',');
        sb.append("networkScopeFieldName");
        sb.append('=');
        sb.append(((this.networkScopeFieldName == null)?"<null>":this.networkScopeFieldName));
        sb.append(',');
        sb.append("queryable");
        sb.append('=');
        sb.append(((this.queryable == null)?"<null>":this.queryable));
        sb.append(',');
        sb.append("recordTypeInfos");
        sb.append('=');
        sb.append(((this.recordTypeInfos == null)?"<null>":this.recordTypeInfos));
        sb.append(',');
        sb.append("replicateable");
        sb.append('=');
        sb.append(((this.replicateable == null)?"<null>":this.replicateable));
        sb.append(',');
        sb.append("retrieveable");
        sb.append('=');
        sb.append(((this.retrieveable == null)?"<null>":this.retrieveable));
        sb.append(',');
        sb.append("searchLayoutable");
        sb.append('=');
        sb.append(((this.searchLayoutable == null)?"<null>":this.searchLayoutable));
        sb.append(',');
        sb.append("searchable");
        sb.append('=');
        sb.append(((this.searchable == null)?"<null>":this.searchable));
        sb.append(',');
        sb.append("supportedScopes");
        sb.append('=');
        sb.append(((this.supportedScopes == null)?"<null>":this.supportedScopes));
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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.mruEnabled == null)? 0 :this.mruEnabled.hashCode()));
        result = ((result* 31)+((this.updateable == null)? 0 :this.updateable.hashCode()));
        result = ((result* 31)+((this.activateable == null)? 0 :this.activateable.hashCode()));
        result = ((result* 31)+((this.childRelationships == null)? 0 :this.childRelationships.hashCode()));
        result = ((result* 31)+((this.recordTypeInfos == null)? 0 :this.recordTypeInfos.hashCode()));
        result = ((result* 31)+((this.deprecatedAndHidden == null)? 0 :this.deprecatedAndHidden.hashCode()));
        result = ((result* 31)+((this.supportedScopes == null)? 0 :this.supportedScopes.hashCode()));
        result = ((result* 31)+((this.searchLayoutable == null)? 0 :this.searchLayoutable.hashCode()));
        result = ((result* 31)+((this.deletable == null)? 0 :this.deletable.hashCode()));
        result = ((result* 31)+((this.replicateable == null)? 0 :this.replicateable.hashCode()));
        result = ((result* 31)+((this.actionOverrides == null)? 0 :this.actionOverrides.hashCode()));
        result = ((result* 31)+((this.isSubtype == null)? 0 :this.isSubtype.hashCode()));
        result = ((result* 31)+((this.lookupLayoutable == null)? 0 :this.lookupLayoutable.hashCode()));
        result = ((result* 31)+((this.listviewable == null)? 0 :this.listviewable.hashCode()));
        result = ((result* 31)+((this.mergeable == null)? 0 :this.mergeable.hashCode()));
        result = ((result* 31)+((this.urls == null)? 0 :this.urls.hashCode()));
        result = ((result* 31)+((this.compactLayoutable == null)? 0 :this.compactLayoutable.hashCode()));
        result = ((result* 31)+((this.feedEnabled == null)? 0 :this.feedEnabled.hashCode()));
        result = ((result* 31)+((this.networkScopeFieldName == null)? 0 :this.networkScopeFieldName.hashCode()));
        result = ((result* 31)+((this.customSetting == null)? 0 :this.customSetting.hashCode()));
        result = ((result* 31)+((this.layoutable == null)? 0 :this.layoutable.hashCode()));
        result = ((result* 31)+((this.custom == null)? 0 :this.custom.hashCode()));
        result = ((result* 31)+((this.undeletable == null)? 0 :this.undeletable.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.keyPrefix == null)? 0 :this.keyPrefix.hashCode()));
        result = ((result* 31)+((this.namedLayoutInfos == null)? 0 :this.namedLayoutInfos.hashCode()));
        result = ((result* 31)+((this.searchable == null)? 0 :this.searchable.hashCode()));
        result = ((result* 31)+((this.queryable == null)? 0 :this.queryable.hashCode()));
        result = ((result* 31)+((this.createable == null)? 0 :this.createable.hashCode()));
        result = ((result* 31)+((this.retrieveable == null)? 0 :this.retrieveable.hashCode()));
        result = ((result* 31)+((this.hasSubtypes == null)? 0 :this.hasSubtypes.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.fields == null)? 0 :this.fields.hashCode()));
        result = ((result* 31)+((this.labelPlural == null)? 0 :this.labelPlural.hashCode()));
        result = ((result* 31)+((this.triggerable == null)? 0 :this.triggerable.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fields) == false) {
            return false;
        }
        Fields rhs = ((Fields) other);
        return ((((((((((((((((((((((((((((((((((((this.mruEnabled == rhs.mruEnabled)||((this.mruEnabled!= null)&&this.mruEnabled.equals(rhs.mruEnabled)))&&((this.updateable == rhs.updateable)||((this.updateable!= null)&&this.updateable.equals(rhs.updateable))))&&((this.activateable == rhs.activateable)||((this.activateable!= null)&&this.activateable.equals(rhs.activateable))))&&((this.childRelationships == rhs.childRelationships)||((this.childRelationships!= null)&&this.childRelationships.equals(rhs.childRelationships))))&&((this.recordTypeInfos == rhs.recordTypeInfos)||((this.recordTypeInfos!= null)&&this.recordTypeInfos.equals(rhs.recordTypeInfos))))&&((this.deprecatedAndHidden == rhs.deprecatedAndHidden)||((this.deprecatedAndHidden!= null)&&this.deprecatedAndHidden.equals(rhs.deprecatedAndHidden))))&&((this.supportedScopes == rhs.supportedScopes)||((this.supportedScopes!= null)&&this.supportedScopes.equals(rhs.supportedScopes))))&&((this.searchLayoutable == rhs.searchLayoutable)||((this.searchLayoutable!= null)&&this.searchLayoutable.equals(rhs.searchLayoutable))))&&((this.deletable == rhs.deletable)||((this.deletable!= null)&&this.deletable.equals(rhs.deletable))))&&((this.replicateable == rhs.replicateable)||((this.replicateable!= null)&&this.replicateable.equals(rhs.replicateable))))&&((this.actionOverrides == rhs.actionOverrides)||((this.actionOverrides!= null)&&this.actionOverrides.equals(rhs.actionOverrides))))&&((this.isSubtype == rhs.isSubtype)||((this.isSubtype!= null)&&this.isSubtype.equals(rhs.isSubtype))))&&((this.lookupLayoutable == rhs.lookupLayoutable)||((this.lookupLayoutable!= null)&&this.lookupLayoutable.equals(rhs.lookupLayoutable))))&&((this.listviewable == rhs.listviewable)||((this.listviewable!= null)&&this.listviewable.equals(rhs.listviewable))))&&((this.mergeable == rhs.mergeable)||((this.mergeable!= null)&&this.mergeable.equals(rhs.mergeable))))&&((this.urls == rhs.urls)||((this.urls!= null)&&this.urls.equals(rhs.urls))))&&((this.compactLayoutable == rhs.compactLayoutable)||((this.compactLayoutable!= null)&&this.compactLayoutable.equals(rhs.compactLayoutable))))&&((this.feedEnabled == rhs.feedEnabled)||((this.feedEnabled!= null)&&this.feedEnabled.equals(rhs.feedEnabled))))&&((this.networkScopeFieldName == rhs.networkScopeFieldName)||((this.networkScopeFieldName!= null)&&this.networkScopeFieldName.equals(rhs.networkScopeFieldName))))&&((this.customSetting == rhs.customSetting)||((this.customSetting!= null)&&this.customSetting.equals(rhs.customSetting))))&&((this.layoutable == rhs.layoutable)||((this.layoutable!= null)&&this.layoutable.equals(rhs.layoutable))))&&((this.custom == rhs.custom)||((this.custom!= null)&&this.custom.equals(rhs.custom))))&&((this.undeletable == rhs.undeletable)||((this.undeletable!= null)&&this.undeletable.equals(rhs.undeletable))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.keyPrefix == rhs.keyPrefix)||((this.keyPrefix!= null)&&this.keyPrefix.equals(rhs.keyPrefix))))&&((this.namedLayoutInfos == rhs.namedLayoutInfos)||((this.namedLayoutInfos!= null)&&this.namedLayoutInfos.equals(rhs.namedLayoutInfos))))&&((this.searchable == rhs.searchable)||((this.searchable!= null)&&this.searchable.equals(rhs.searchable))))&&((this.queryable == rhs.queryable)||((this.queryable!= null)&&this.queryable.equals(rhs.queryable))))&&((this.createable == rhs.createable)||((this.createable!= null)&&this.createable.equals(rhs.createable))))&&((this.retrieveable == rhs.retrieveable)||((this.retrieveable!= null)&&this.retrieveable.equals(rhs.retrieveable))))&&((this.hasSubtypes == rhs.hasSubtypes)||((this.hasSubtypes!= null)&&this.hasSubtypes.equals(rhs.hasSubtypes))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.fields == rhs.fields)||((this.fields!= null)&&this.fields.equals(rhs.fields))))&&((this.labelPlural == rhs.labelPlural)||((this.labelPlural!= null)&&this.labelPlural.equals(rhs.labelPlural))))&&((this.triggerable == rhs.triggerable)||((this.triggerable!= null)&&this.triggerable.equals(rhs.triggerable))));
    }

}
