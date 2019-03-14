package com.sfdc.fields.wrappers;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Field {

    @SerializedName("aggregatable")
    @Expose
    private Boolean aggregatable;
    @SerializedName("aiPredictionField")
    @Expose
    private Boolean aiPredictionField;
    @SerializedName("autoNumber")
    @Expose
    private Boolean autoNumber;
    @SerializedName("byteLength")
    @Expose
    private Integer byteLength;
    @SerializedName("calculated")
    @Expose
    private Boolean calculated;
    @SerializedName("calculatedFormula")
    @Expose
    private Object calculatedFormula;
    @SerializedName("cascadeDelete")
    @Expose
    private Boolean cascadeDelete;
    @SerializedName("caseSensitive")
    @Expose
    private Boolean caseSensitive;
    @SerializedName("compoundFieldName")
    @Expose
    private Object compoundFieldName;
    @SerializedName("controllerName")
    @Expose
    private Object controllerName;
    @SerializedName("createable")
    @Expose
    private Boolean createable;
    @SerializedName("custom")
    @Expose
    private Boolean custom;
    @SerializedName("defaultValue")
    @Expose
    private Object defaultValue;
    @SerializedName("defaultValueFormula")
    @Expose
    private Object defaultValueFormula;
    @SerializedName("defaultedOnCreate")
    @Expose
    private Boolean defaultedOnCreate;
    @SerializedName("dependentPicklist")
    @Expose
    private Boolean dependentPicklist;
    @SerializedName("deprecatedAndHidden")
    @Expose
    private Boolean deprecatedAndHidden;
    @SerializedName("digits")
    @Expose
    private Integer digits;
    @SerializedName("displayLocationInDecimal")
    @Expose
    private Boolean displayLocationInDecimal;
    @SerializedName("encrypted")
    @Expose
    private Boolean encrypted;
    @SerializedName("externalId")
    @Expose
    private Boolean externalId;
    @SerializedName("extraTypeInfo")
    @Expose
    private Object extraTypeInfo;
    @SerializedName("filterable")
    @Expose
    private Boolean filterable;
    @SerializedName("filteredLookupInfo")
    @Expose
    private Object filteredLookupInfo;
    @SerializedName("formulaTreatNullNumberAsZero")
    @Expose
    private Boolean formulaTreatNullNumberAsZero;
    @SerializedName("groupable")
    @Expose
    private Boolean groupable;
    @SerializedName("highScaleNumber")
    @Expose
    private Boolean highScaleNumber;
    @SerializedName("htmlFormatted")
    @Expose
    private Boolean htmlFormatted;
    @SerializedName("idLookup")
    @Expose
    private Boolean idLookup;
    @SerializedName("inlineHelpText")
    @Expose
    private Object inlineHelpText;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("length")
    @Expose
    private Integer length;
    @SerializedName("mask")
    @Expose
    private Object mask;
    @SerializedName("maskType")
    @Expose
    private Object maskType;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nameField")
    @Expose
    private Boolean nameField;
    @SerializedName("namePointing")
    @Expose
    private Boolean namePointing;
    @SerializedName("nillable")
    @Expose
    private Boolean nillable;
    @SerializedName("permissionable")
    @Expose
    private Boolean permissionable;
    @SerializedName("picklistValues")
    @Expose
    private List<PicklistValue> picklistValues = new ArrayList<PicklistValue>();
    @SerializedName("polymorphicForeignKey")
    @Expose
    private Boolean polymorphicForeignKey;
    @SerializedName("precision")
    @Expose
    private Integer precision;
    @SerializedName("queryByDistance")
    @Expose
    private Boolean queryByDistance;
    @SerializedName("referenceTargetField")
    @Expose
    private Object referenceTargetField;
    @SerializedName("referenceTo")
    @Expose
    private List<String> referenceTo = new ArrayList<String>();
    @SerializedName("relationshipName")
    @Expose
    private Object relationshipName;
    @SerializedName("relationshipOrder")
    @Expose
    private Object relationshipOrder;
    @SerializedName("restrictedDelete")
    @Expose
    private Boolean restrictedDelete;
    @SerializedName("restrictedPicklist")
    @Expose
    private Boolean restrictedPicklist;
    @SerializedName("scale")
    @Expose
    private Integer scale;
    @SerializedName("searchPrefilterable")
    @Expose
    private Boolean searchPrefilterable;
    @SerializedName("soapType")
    @Expose
    private String soapType;
    @SerializedName("sortable")
    @Expose
    private Boolean sortable;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("unique")
    @Expose
    private Boolean unique;
    @SerializedName("updateable")
    @Expose
    private Boolean updateable;
    @SerializedName("writeRequiresMasterRead")
    @Expose
    private Boolean writeRequiresMasterRead;

    public Boolean getAggregatable() {
        return aggregatable;
    }

    public void setAggregatable(Boolean aggregatable) {
        this.aggregatable = aggregatable;
    }

    public Boolean getAiPredictionField() {
        return aiPredictionField;
    }

    public void setAiPredictionField(Boolean aiPredictionField) {
        this.aiPredictionField = aiPredictionField;
    }

    public Boolean getAutoNumber() {
        return autoNumber;
    }

    public void setAutoNumber(Boolean autoNumber) {
        this.autoNumber = autoNumber;
    }

    public Integer getByteLength() {
        return byteLength;
    }

    public void setByteLength(Integer byteLength) {
        this.byteLength = byteLength;
    }

    public Boolean getCalculated() {
        return calculated;
    }

    public void setCalculated(Boolean calculated) {
        this.calculated = calculated;
    }

    public Object getCalculatedFormula() {
        return calculatedFormula;
    }

    public void setCalculatedFormula(Object calculatedFormula) {
        this.calculatedFormula = calculatedFormula;
    }

    public Boolean getCascadeDelete() {
        return cascadeDelete;
    }

    public void setCascadeDelete(Boolean cascadeDelete) {
        this.cascadeDelete = cascadeDelete;
    }

    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public Object getCompoundFieldName() {
        return compoundFieldName;
    }

    public void setCompoundFieldName(Object compoundFieldName) {
        this.compoundFieldName = compoundFieldName;
    }

    public Object getControllerName() {
        return controllerName;
    }

    public void setControllerName(Object controllerName) {
        this.controllerName = controllerName;
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

    public Object getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Object getDefaultValueFormula() {
        return defaultValueFormula;
    }

    public void setDefaultValueFormula(Object defaultValueFormula) {
        this.defaultValueFormula = defaultValueFormula;
    }

    public Boolean getDefaultedOnCreate() {
        return defaultedOnCreate;
    }

    public void setDefaultedOnCreate(Boolean defaultedOnCreate) {
        this.defaultedOnCreate = defaultedOnCreate;
    }

    public Boolean getDependentPicklist() {
        return dependentPicklist;
    }

    public void setDependentPicklist(Boolean dependentPicklist) {
        this.dependentPicklist = dependentPicklist;
    }

    public Boolean getDeprecatedAndHidden() {
        return deprecatedAndHidden;
    }

    public void setDeprecatedAndHidden(Boolean deprecatedAndHidden) {
        this.deprecatedAndHidden = deprecatedAndHidden;
    }

    public Integer getDigits() {
        return digits;
    }

    public void setDigits(Integer digits) {
        this.digits = digits;
    }

    public Boolean getDisplayLocationInDecimal() {
        return displayLocationInDecimal;
    }

    public void setDisplayLocationInDecimal(Boolean displayLocationInDecimal) {
        this.displayLocationInDecimal = displayLocationInDecimal;
    }

    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Boolean getExternalId() {
        return externalId;
    }

    public void setExternalId(Boolean externalId) {
        this.externalId = externalId;
    }

    public Object getExtraTypeInfo() {
        return extraTypeInfo;
    }

    public void setExtraTypeInfo(Object extraTypeInfo) {
        this.extraTypeInfo = extraTypeInfo;
    }

    public Boolean getFilterable() {
        return filterable;
    }

    public void setFilterable(Boolean filterable) {
        this.filterable = filterable;
    }

    public Object getFilteredLookupInfo() {
        return filteredLookupInfo;
    }

    public void setFilteredLookupInfo(Object filteredLookupInfo) {
        this.filteredLookupInfo = filteredLookupInfo;
    }

    public Boolean getFormulaTreatNullNumberAsZero() {
        return formulaTreatNullNumberAsZero;
    }

    public void setFormulaTreatNullNumberAsZero(Boolean formulaTreatNullNumberAsZero) {
        this.formulaTreatNullNumberAsZero = formulaTreatNullNumberAsZero;
    }

    public Boolean getGroupable() {
        return groupable;
    }

    public void setGroupable(Boolean groupable) {
        this.groupable = groupable;
    }

    public Boolean getHighScaleNumber() {
        return highScaleNumber;
    }

    public void setHighScaleNumber(Boolean highScaleNumber) {
        this.highScaleNumber = highScaleNumber;
    }

    public Boolean getHtmlFormatted() {
        return htmlFormatted;
    }

    public void setHtmlFormatted(Boolean htmlFormatted) {
        this.htmlFormatted = htmlFormatted;
    }

    public Boolean getIdLookup() {
        return idLookup;
    }

    public void setIdLookup(Boolean idLookup) {
        this.idLookup = idLookup;
    }

    public Object getInlineHelpText() {
        return inlineHelpText;
    }

    public void setInlineHelpText(Object inlineHelpText) {
        this.inlineHelpText = inlineHelpText;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Object getMask() {
        return mask;
    }

    public void setMask(Object mask) {
        this.mask = mask;
    }

    public Object getMaskType() {
        return maskType;
    }

    public void setMaskType(Object maskType) {
        this.maskType = maskType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNameField() {
        return nameField;
    }

    public void setNameField(Boolean nameField) {
        this.nameField = nameField;
    }

    public Boolean getNamePointing() {
        return namePointing;
    }

    public void setNamePointing(Boolean namePointing) {
        this.namePointing = namePointing;
    }

    public Boolean getNillable() {
        return nillable;
    }

    public void setNillable(Boolean nillable) {
        this.nillable = nillable;
    }

    public Boolean getPermissionable() {
        return permissionable;
    }

    public void setPermissionable(Boolean permissionable) {
        this.permissionable = permissionable;
    }

    public List<PicklistValue> getPicklistValues() {
        return picklistValues;
    }

    public void setPicklistValues(List<PicklistValue> picklistValues) {
        this.picklistValues = picklistValues;
    }

    public Boolean getPolymorphicForeignKey() {
        return polymorphicForeignKey;
    }

    public void setPolymorphicForeignKey(Boolean polymorphicForeignKey) {
        this.polymorphicForeignKey = polymorphicForeignKey;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Boolean getQueryByDistance() {
        return queryByDistance;
    }

    public void setQueryByDistance(Boolean queryByDistance) {
        this.queryByDistance = queryByDistance;
    }

    public Object getReferenceTargetField() {
        return referenceTargetField;
    }

    public void setReferenceTargetField(Object referenceTargetField) {
        this.referenceTargetField = referenceTargetField;
    }

    public List<String> getReferenceTo() {
        return referenceTo;
    }

    public void setReferenceTo(List<String> referenceTo) {
        this.referenceTo = referenceTo;
    }

    public Object getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(Object relationshipName) {
        this.relationshipName = relationshipName;
    }

    public Object getRelationshipOrder() {
        return relationshipOrder;
    }

    public void setRelationshipOrder(Object relationshipOrder) {
        this.relationshipOrder = relationshipOrder;
    }

    public Boolean getRestrictedDelete() {
        return restrictedDelete;
    }

    public void setRestrictedDelete(Boolean restrictedDelete) {
        this.restrictedDelete = restrictedDelete;
    }

    public Boolean getRestrictedPicklist() {
        return restrictedPicklist;
    }

    public void setRestrictedPicklist(Boolean restrictedPicklist) {
        this.restrictedPicklist = restrictedPicklist;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Boolean getSearchPrefilterable() {
        return searchPrefilterable;
    }

    public void setSearchPrefilterable(Boolean searchPrefilterable) {
        this.searchPrefilterable = searchPrefilterable;
    }

    public String getSoapType() {
        return soapType;
    }

    public void setSoapType(String soapType) {
        this.soapType = soapType;
    }

    public Boolean getSortable() {
        return sortable;
    }

    public void setSortable(Boolean sortable) {
        this.sortable = sortable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getUnique() {
        return unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public Boolean getUpdateable() {
        return updateable;
    }

    public void setUpdateable(Boolean updateable) {
        this.updateable = updateable;
    }

    public Boolean getWriteRequiresMasterRead() {
        return writeRequiresMasterRead;
    }

    public void setWriteRequiresMasterRead(Boolean writeRequiresMasterRead) {
        this.writeRequiresMasterRead = writeRequiresMasterRead;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Field.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aggregatable");
        sb.append('=');
        sb.append(((this.aggregatable == null)?"<null>":this.aggregatable));
        sb.append(',');
        sb.append("aiPredictionField");
        sb.append('=');
        sb.append(((this.aiPredictionField == null)?"<null>":this.aiPredictionField));
        sb.append(',');
        sb.append("autoNumber");
        sb.append('=');
        sb.append(((this.autoNumber == null)?"<null>":this.autoNumber));
        sb.append(',');
        sb.append("byteLength");
        sb.append('=');
        sb.append(((this.byteLength == null)?"<null>":this.byteLength));
        sb.append(',');
        sb.append("calculated");
        sb.append('=');
        sb.append(((this.calculated == null)?"<null>":this.calculated));
        sb.append(',');
        sb.append("calculatedFormula");
        sb.append('=');
        sb.append(((this.calculatedFormula == null)?"<null>":this.calculatedFormula));
        sb.append(',');
        sb.append("cascadeDelete");
        sb.append('=');
        sb.append(((this.cascadeDelete == null)?"<null>":this.cascadeDelete));
        sb.append(',');
        sb.append("caseSensitive");
        sb.append('=');
        sb.append(((this.caseSensitive == null)?"<null>":this.caseSensitive));
        sb.append(',');
        sb.append("compoundFieldName");
        sb.append('=');
        sb.append(((this.compoundFieldName == null)?"<null>":this.compoundFieldName));
        sb.append(',');
        sb.append("controllerName");
        sb.append('=');
        sb.append(((this.controllerName == null)?"<null>":this.controllerName));
        sb.append(',');
        sb.append("createable");
        sb.append('=');
        sb.append(((this.createable == null)?"<null>":this.createable));
        sb.append(',');
        sb.append("custom");
        sb.append('=');
        sb.append(((this.custom == null)?"<null>":this.custom));
        sb.append(',');
        sb.append("defaultValue");
        sb.append('=');
        sb.append(((this.defaultValue == null)?"<null>":this.defaultValue));
        sb.append(',');
        sb.append("defaultValueFormula");
        sb.append('=');
        sb.append(((this.defaultValueFormula == null)?"<null>":this.defaultValueFormula));
        sb.append(',');
        sb.append("defaultedOnCreate");
        sb.append('=');
        sb.append(((this.defaultedOnCreate == null)?"<null>":this.defaultedOnCreate));
        sb.append(',');
        sb.append("dependentPicklist");
        sb.append('=');
        sb.append(((this.dependentPicklist == null)?"<null>":this.dependentPicklist));
        sb.append(',');
        sb.append("deprecatedAndHidden");
        sb.append('=');
        sb.append(((this.deprecatedAndHidden == null)?"<null>":this.deprecatedAndHidden));
        sb.append(',');
        sb.append("digits");
        sb.append('=');
        sb.append(((this.digits == null)?"<null>":this.digits));
        sb.append(',');
        sb.append("displayLocationInDecimal");
        sb.append('=');
        sb.append(((this.displayLocationInDecimal == null)?"<null>":this.displayLocationInDecimal));
        sb.append(',');
        sb.append("encrypted");
        sb.append('=');
        sb.append(((this.encrypted == null)?"<null>":this.encrypted));
        sb.append(',');
        sb.append("externalId");
        sb.append('=');
        sb.append(((this.externalId == null)?"<null>":this.externalId));
        sb.append(',');
        sb.append("extraTypeInfo");
        sb.append('=');
        sb.append(((this.extraTypeInfo == null)?"<null>":this.extraTypeInfo));
        sb.append(',');
        sb.append("filterable");
        sb.append('=');
        sb.append(((this.filterable == null)?"<null>":this.filterable));
        sb.append(',');
        sb.append("filteredLookupInfo");
        sb.append('=');
        sb.append(((this.filteredLookupInfo == null)?"<null>":this.filteredLookupInfo));
        sb.append(',');
        sb.append("formulaTreatNullNumberAsZero");
        sb.append('=');
        sb.append(((this.formulaTreatNullNumberAsZero == null)?"<null>":this.formulaTreatNullNumberAsZero));
        sb.append(',');
        sb.append("groupable");
        sb.append('=');
        sb.append(((this.groupable == null)?"<null>":this.groupable));
        sb.append(',');
        sb.append("highScaleNumber");
        sb.append('=');
        sb.append(((this.highScaleNumber == null)?"<null>":this.highScaleNumber));
        sb.append(',');
        sb.append("htmlFormatted");
        sb.append('=');
        sb.append(((this.htmlFormatted == null)?"<null>":this.htmlFormatted));
        sb.append(',');
        sb.append("idLookup");
        sb.append('=');
        sb.append(((this.idLookup == null)?"<null>":this.idLookup));
        sb.append(',');
        sb.append("inlineHelpText");
        sb.append('=');
        sb.append(((this.inlineHelpText == null)?"<null>":this.inlineHelpText));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("length");
        sb.append('=');
        sb.append(((this.length == null)?"<null>":this.length));
        sb.append(',');
        sb.append("mask");
        sb.append('=');
        sb.append(((this.mask == null)?"<null>":this.mask));
        sb.append(',');
        sb.append("maskType");
        sb.append('=');
        sb.append(((this.maskType == null)?"<null>":this.maskType));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameField");
        sb.append('=');
        sb.append(((this.nameField == null)?"<null>":this.nameField));
        sb.append(',');
        sb.append("namePointing");
        sb.append('=');
        sb.append(((this.namePointing == null)?"<null>":this.namePointing));
        sb.append(',');
        sb.append("nillable");
        sb.append('=');
        sb.append(((this.nillable == null)?"<null>":this.nillable));
        sb.append(',');
        sb.append("permissionable");
        sb.append('=');
        sb.append(((this.permissionable == null)?"<null>":this.permissionable));
        sb.append(',');
        sb.append("picklistValues");
        sb.append('=');
        sb.append(((this.picklistValues == null)?"<null>":this.picklistValues));
        sb.append(',');
        sb.append("polymorphicForeignKey");
        sb.append('=');
        sb.append(((this.polymorphicForeignKey == null)?"<null>":this.polymorphicForeignKey));
        sb.append(',');
        sb.append("precision");
        sb.append('=');
        sb.append(((this.precision == null)?"<null>":this.precision));
        sb.append(',');
        sb.append("queryByDistance");
        sb.append('=');
        sb.append(((this.queryByDistance == null)?"<null>":this.queryByDistance));
        sb.append(',');
        sb.append("referenceTargetField");
        sb.append('=');
        sb.append(((this.referenceTargetField == null)?"<null>":this.referenceTargetField));
        sb.append(',');
        sb.append("referenceTo");
        sb.append('=');
        sb.append(((this.referenceTo == null)?"<null>":this.referenceTo));
        sb.append(',');
        sb.append("relationshipName");
        sb.append('=');
        sb.append(((this.relationshipName == null)?"<null>":this.relationshipName));
        sb.append(',');
        sb.append("relationshipOrder");
        sb.append('=');
        sb.append(((this.relationshipOrder == null)?"<null>":this.relationshipOrder));
        sb.append(',');
        sb.append("restrictedDelete");
        sb.append('=');
        sb.append(((this.restrictedDelete == null)?"<null>":this.restrictedDelete));
        sb.append(',');
        sb.append("restrictedPicklist");
        sb.append('=');
        sb.append(((this.restrictedPicklist == null)?"<null>":this.restrictedPicklist));
        sb.append(',');
        sb.append("scale");
        sb.append('=');
        sb.append(((this.scale == null)?"<null>":this.scale));
        sb.append(',');
        sb.append("searchPrefilterable");
        sb.append('=');
        sb.append(((this.searchPrefilterable == null)?"<null>":this.searchPrefilterable));
        sb.append(',');
        sb.append("soapType");
        sb.append('=');
        sb.append(((this.soapType == null)?"<null>":this.soapType));
        sb.append(',');
        sb.append("sortable");
        sb.append('=');
        sb.append(((this.sortable == null)?"<null>":this.sortable));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("unique");
        sb.append('=');
        sb.append(((this.unique == null)?"<null>":this.unique));
        sb.append(',');
        sb.append("updateable");
        sb.append('=');
        sb.append(((this.updateable == null)?"<null>":this.updateable));
        sb.append(',');
        sb.append("writeRequiresMasterRead");
        sb.append('=');
        sb.append(((this.writeRequiresMasterRead == null)?"<null>":this.writeRequiresMasterRead));
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
        result = ((result* 31)+((this.defaultValue == null)? 0 :this.defaultValue.hashCode()));
        result = ((result* 31)+((this.precision == null)? 0 :this.precision.hashCode()));
        result = ((result* 31)+((this.compoundFieldName == null)? 0 :this.compoundFieldName.hashCode()));
        result = ((result* 31)+((this.nameField == null)? 0 :this.nameField.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.restrictedDelete == null)? 0 :this.restrictedDelete.hashCode()));
        result = ((result* 31)+((this.relationshipName == null)? 0 :this.relationshipName.hashCode()));
        result = ((result* 31)+((this.calculatedFormula == null)? 0 :this.calculatedFormula.hashCode()));
        result = ((result* 31)+((this.controllerName == null)? 0 :this.controllerName.hashCode()));
        result = ((result* 31)+((this.namePointing == null)? 0 :this.namePointing.hashCode()));
        result = ((result* 31)+((this.defaultValueFormula == null)? 0 :this.defaultValueFormula.hashCode()));
        result = ((result* 31)+((this.calculated == null)? 0 :this.calculated.hashCode()));
        result = ((result* 31)+((this.writeRequiresMasterRead == null)? 0 :this.writeRequiresMasterRead.hashCode()));
        result = ((result* 31)+((this.inlineHelpText == null)? 0 :this.inlineHelpText.hashCode()));
        result = ((result* 31)+((this.picklistValues == null)? 0 :this.picklistValues.hashCode()));
        result = ((result* 31)+((this.aiPredictionField == null)? 0 :this.aiPredictionField.hashCode()));
        result = ((result* 31)+((this.filterable == null)? 0 :this.filterable.hashCode()));
        result = ((result* 31)+((this.maskType == null)? 0 :this.maskType.hashCode()));
        result = ((result* 31)+((this.queryByDistance == null)? 0 :this.queryByDistance.hashCode()));
        result = ((result* 31)+((this.caseSensitive == null)? 0 :this.caseSensitive.hashCode()));
        result = ((result* 31)+((this.aggregatable == null)? 0 :this.aggregatable.hashCode()));
        result = ((result* 31)+((this.referenceTo == null)? 0 :this.referenceTo.hashCode()));
        result = ((result* 31)+((this.soapType == null)? 0 :this.soapType.hashCode()));
        result = ((result* 31)+((this.unique == null)? 0 :this.unique.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.highScaleNumber == null)? 0 :this.highScaleNumber.hashCode()));
        result = ((result* 31)+((this.idLookup == null)? 0 :this.idLookup.hashCode()));
        result = ((result* 31)+((this.displayLocationInDecimal == null)? 0 :this.displayLocationInDecimal.hashCode()));
        result = ((result* 31)+((this.defaultedOnCreate == null)? 0 :this.defaultedOnCreate.hashCode()));
        result = ((result* 31)+((this.updateable == null)? 0 :this.updateable.hashCode()));
        result = ((result* 31)+((this.deprecatedAndHidden == null)? 0 :this.deprecatedAndHidden.hashCode()));
        result = ((result* 31)+((this.byteLength == null)? 0 :this.byteLength.hashCode()));
        result = ((result* 31)+((this.scale == null)? 0 :this.scale.hashCode()));
        result = ((result* 31)+((this.polymorphicForeignKey == null)? 0 :this.polymorphicForeignKey.hashCode()));
        result = ((result* 31)+((this.nillable == null)? 0 :this.nillable.hashCode()));
        result = ((result* 31)+((this.htmlFormatted == null)? 0 :this.htmlFormatted.hashCode()));
        result = ((result* 31)+((this.referenceTargetField == null)? 0 :this.referenceTargetField.hashCode()));
        result = ((result* 31)+((this.cascadeDelete == null)? 0 :this.cascadeDelete.hashCode()));
        result = ((result* 31)+((this.mask == null)? 0 :this.mask.hashCode()));
        result = ((result* 31)+((this.permissionable == null)? 0 :this.permissionable.hashCode()));
        result = ((result* 31)+((this.relationshipOrder == null)? 0 :this.relationshipOrder.hashCode()));
        result = ((result* 31)+((this.custom == null)? 0 :this.custom.hashCode()));
        result = ((result* 31)+((this.length == null)? 0 :this.length.hashCode()));
        result = ((result* 31)+((this.externalId == null)? 0 :this.externalId.hashCode()));
        result = ((result* 31)+((this.dependentPicklist == null)? 0 :this.dependentPicklist.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.sortable == null)? 0 :this.sortable.hashCode()));
        result = ((result* 31)+((this.autoNumber == null)? 0 :this.autoNumber.hashCode()));
        result = ((result* 31)+((this.filteredLookupInfo == null)? 0 :this.filteredLookupInfo.hashCode()));
        result = ((result* 31)+((this.restrictedPicklist == null)? 0 :this.restrictedPicklist.hashCode()));
        result = ((result* 31)+((this.createable == null)? 0 :this.createable.hashCode()));
        result = ((result* 31)+((this.encrypted == null)? 0 :this.encrypted.hashCode()));
        result = ((result* 31)+((this.searchPrefilterable == null)? 0 :this.searchPrefilterable.hashCode()));
        result = ((result* 31)+((this.extraTypeInfo == null)? 0 :this.extraTypeInfo.hashCode()));
        result = ((result* 31)+((this.groupable == null)? 0 :this.groupable.hashCode()));
        result = ((result* 31)+((this.digits == null)? 0 :this.digits.hashCode()));
        result = ((result* 31)+((this.formulaTreatNullNumberAsZero == null)? 0 :this.formulaTreatNullNumberAsZero.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Field) == false) {
            return false;
        }
        Field rhs = ((Field) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.defaultValue == rhs.defaultValue)||((this.defaultValue!= null)&&this.defaultValue.equals(rhs.defaultValue)))&&((this.precision == rhs.precision)||((this.precision!= null)&&this.precision.equals(rhs.precision))))&&((this.compoundFieldName == rhs.compoundFieldName)||((this.compoundFieldName!= null)&&this.compoundFieldName.equals(rhs.compoundFieldName))))&&((this.nameField == rhs.nameField)||((this.nameField!= null)&&this.nameField.equals(rhs.nameField))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.restrictedDelete == rhs.restrictedDelete)||((this.restrictedDelete!= null)&&this.restrictedDelete.equals(rhs.restrictedDelete))))&&((this.relationshipName == rhs.relationshipName)||((this.relationshipName!= null)&&this.relationshipName.equals(rhs.relationshipName))))&&((this.calculatedFormula == rhs.calculatedFormula)||((this.calculatedFormula!= null)&&this.calculatedFormula.equals(rhs.calculatedFormula))))&&((this.controllerName == rhs.controllerName)||((this.controllerName!= null)&&this.controllerName.equals(rhs.controllerName))))&&((this.namePointing == rhs.namePointing)||((this.namePointing!= null)&&this.namePointing.equals(rhs.namePointing))))&&((this.defaultValueFormula == rhs.defaultValueFormula)||((this.defaultValueFormula!= null)&&this.defaultValueFormula.equals(rhs.defaultValueFormula))))&&((this.calculated == rhs.calculated)||((this.calculated!= null)&&this.calculated.equals(rhs.calculated))))&&((this.writeRequiresMasterRead == rhs.writeRequiresMasterRead)||((this.writeRequiresMasterRead!= null)&&this.writeRequiresMasterRead.equals(rhs.writeRequiresMasterRead))))&&((this.inlineHelpText == rhs.inlineHelpText)||((this.inlineHelpText!= null)&&this.inlineHelpText.equals(rhs.inlineHelpText))))&&((this.picklistValues == rhs.picklistValues)||((this.picklistValues!= null)&&this.picklistValues.equals(rhs.picklistValues))))&&((this.aiPredictionField == rhs.aiPredictionField)||((this.aiPredictionField!= null)&&this.aiPredictionField.equals(rhs.aiPredictionField))))&&((this.filterable == rhs.filterable)||((this.filterable!= null)&&this.filterable.equals(rhs.filterable))))&&((this.maskType == rhs.maskType)||((this.maskType!= null)&&this.maskType.equals(rhs.maskType))))&&((this.queryByDistance == rhs.queryByDistance)||((this.queryByDistance!= null)&&this.queryByDistance.equals(rhs.queryByDistance))))&&((this.caseSensitive == rhs.caseSensitive)||((this.caseSensitive!= null)&&this.caseSensitive.equals(rhs.caseSensitive))))&&((this.aggregatable == rhs.aggregatable)||((this.aggregatable!= null)&&this.aggregatable.equals(rhs.aggregatable))))&&((this.referenceTo == rhs.referenceTo)||((this.referenceTo!= null)&&this.referenceTo.equals(rhs.referenceTo))))&&((this.soapType == rhs.soapType)||((this.soapType!= null)&&this.soapType.equals(rhs.soapType))))&&((this.unique == rhs.unique)||((this.unique!= null)&&this.unique.equals(rhs.unique))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.highScaleNumber == rhs.highScaleNumber)||((this.highScaleNumber!= null)&&this.highScaleNumber.equals(rhs.highScaleNumber))))&&((this.idLookup == rhs.idLookup)||((this.idLookup!= null)&&this.idLookup.equals(rhs.idLookup))))&&((this.displayLocationInDecimal == rhs.displayLocationInDecimal)||((this.displayLocationInDecimal!= null)&&this.displayLocationInDecimal.equals(rhs.displayLocationInDecimal))))&&((this.defaultedOnCreate == rhs.defaultedOnCreate)||((this.defaultedOnCreate!= null)&&this.defaultedOnCreate.equals(rhs.defaultedOnCreate))))&&((this.updateable == rhs.updateable)||((this.updateable!= null)&&this.updateable.equals(rhs.updateable))))&&((this.deprecatedAndHidden == rhs.deprecatedAndHidden)||((this.deprecatedAndHidden!= null)&&this.deprecatedAndHidden.equals(rhs.deprecatedAndHidden))))&&((this.byteLength == rhs.byteLength)||((this.byteLength!= null)&&this.byteLength.equals(rhs.byteLength))))&&((this.scale == rhs.scale)||((this.scale!= null)&&this.scale.equals(rhs.scale))))&&((this.polymorphicForeignKey == rhs.polymorphicForeignKey)||((this.polymorphicForeignKey!= null)&&this.polymorphicForeignKey.equals(rhs.polymorphicForeignKey))))&&((this.nillable == rhs.nillable)||((this.nillable!= null)&&this.nillable.equals(rhs.nillable))))&&((this.htmlFormatted == rhs.htmlFormatted)||((this.htmlFormatted!= null)&&this.htmlFormatted.equals(rhs.htmlFormatted))))&&((this.referenceTargetField == rhs.referenceTargetField)||((this.referenceTargetField!= null)&&this.referenceTargetField.equals(rhs.referenceTargetField))))&&((this.cascadeDelete == rhs.cascadeDelete)||((this.cascadeDelete!= null)&&this.cascadeDelete.equals(rhs.cascadeDelete))))&&((this.mask == rhs.mask)||((this.mask!= null)&&this.mask.equals(rhs.mask))))&&((this.permissionable == rhs.permissionable)||((this.permissionable!= null)&&this.permissionable.equals(rhs.permissionable))))&&((this.relationshipOrder == rhs.relationshipOrder)||((this.relationshipOrder!= null)&&this.relationshipOrder.equals(rhs.relationshipOrder))))&&((this.custom == rhs.custom)||((this.custom!= null)&&this.custom.equals(rhs.custom))))&&((this.length == rhs.length)||((this.length!= null)&&this.length.equals(rhs.length))))&&((this.externalId == rhs.externalId)||((this.externalId!= null)&&this.externalId.equals(rhs.externalId))))&&((this.dependentPicklist == rhs.dependentPicklist)||((this.dependentPicklist!= null)&&this.dependentPicklist.equals(rhs.dependentPicklist))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.sortable == rhs.sortable)||((this.sortable!= null)&&this.sortable.equals(rhs.sortable))))&&((this.autoNumber == rhs.autoNumber)||((this.autoNumber!= null)&&this.autoNumber.equals(rhs.autoNumber))))&&((this.filteredLookupInfo == rhs.filteredLookupInfo)||((this.filteredLookupInfo!= null)&&this.filteredLookupInfo.equals(rhs.filteredLookupInfo))))&&((this.restrictedPicklist == rhs.restrictedPicklist)||((this.restrictedPicklist!= null)&&this.restrictedPicklist.equals(rhs.restrictedPicklist))))&&((this.createable == rhs.createable)||((this.createable!= null)&&this.createable.equals(rhs.createable))))&&((this.encrypted == rhs.encrypted)||((this.encrypted!= null)&&this.encrypted.equals(rhs.encrypted))))&&((this.searchPrefilterable == rhs.searchPrefilterable)||((this.searchPrefilterable!= null)&&this.searchPrefilterable.equals(rhs.searchPrefilterable))))&&((this.extraTypeInfo == rhs.extraTypeInfo)||((this.extraTypeInfo!= null)&&this.extraTypeInfo.equals(rhs.extraTypeInfo))))&&((this.groupable == rhs.groupable)||((this.groupable!= null)&&this.groupable.equals(rhs.groupable))))&&((this.digits == rhs.digits)||((this.digits!= null)&&this.digits.equals(rhs.digits))))&&((this.formulaTreatNullNumberAsZero == rhs.formulaTreatNullNumberAsZero)||((this.formulaTreatNullNumberAsZero!= null)&&this.formulaTreatNullNumberAsZero.equals(rhs.formulaTreatNullNumberAsZero))));
    }

}
