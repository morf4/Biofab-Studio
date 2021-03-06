package org.clothocad.hibernate.data;
// Generated Oct 12, 2010 7:14:51 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TraitTable generated by hbm2java
 */
public class TraitTable  implements java.io.Serializable {


     private String idTrait;
     private FamilyTable familyTable;
     private Integer position;
     private String name;
     private String kind;
     private String type;
     private String value;
     private String constraint;
     private Date dateCreated;
     private Date lastModified;
     private Set traitFamilyXrefs = new HashSet(0);
     private Set featureTraitXrefs = new HashSet(0);

    public TraitTable() {
    }


    public TraitTable(String idTrait) {
        this.idTrait = idTrait;
    }
    public TraitTable(String idTrait, FamilyTable familyTable, Integer position, String name, String kind, String type, String value, String constraint, Date dateCreated, Date lastModified, Set traitFamilyXrefs, Set featureTraitXrefs) {
       this.idTrait = idTrait;
       this.familyTable = familyTable;
       this.position = position;
       this.name = name;
       this.kind = kind;
       this.type = type;
       this.value = value;
       this.constraint = constraint;
       this.dateCreated = dateCreated;
       this.lastModified = lastModified;
       this.traitFamilyXrefs = traitFamilyXrefs;
       this.featureTraitXrefs = featureTraitXrefs;
    }

    public String getIdTrait() {
        return this.idTrait;
    }

    public void setIdTrait(String idTrait) {
        this.idTrait = idTrait;
    }
    public FamilyTable getFamilyTable() {
        return this.familyTable;
    }

    public void setFamilyTable(FamilyTable familyTable) {
        this.familyTable = familyTable;
    }
    public Integer getPosition() {
        return this.position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getConstraint() {
        return this.constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Date getLastModified() {
        return this.lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
    public Set getTraitFamilyXrefs() {
        return this.traitFamilyXrefs;
    }

    public void setTraitFamilyXrefs(Set traitFamilyXrefs) {
        this.traitFamilyXrefs = traitFamilyXrefs;
    }
    public Set getFeatureTraitXrefs() {
        return this.featureTraitXrefs;
    }

    public void setFeatureTraitXrefs(Set featureTraitXrefs) {
        this.featureTraitXrefs = featureTraitXrefs;
    }
}
