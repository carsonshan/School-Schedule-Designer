//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.03 at 08:27:16 PM CET 
//


package org.posithing.ssd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchoolScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.posithing.com/schoolschedulemanager/}teachers" minOccurs="0"/>
 *         &lt;element ref="{http://www.posithing.com/schoolschedulemanager/}subjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.posithing.com/schoolschedulemanager/}classes" minOccurs="0"/>
 *         &lt;element ref="{http://www.posithing.com/schoolschedulemanager/}options" minOccurs="0"/>
 *         &lt;element ref="{http://www.posithing.com/schoolschedulemanager/}timeSlotsAssignment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolScheduleType", propOrder = {
    "teachers",
    "subjects",
    "classes",
    "options",
    "timeSlotsAssignment"
})
public class SchoolScheduleType {

    protected TeachersType teachers;
    protected SubjectsType subjects;
    protected ClassesType classes;
    protected OptionsType options;
    protected TimeSlotsAssignmentType timeSlotsAssignment;

    /**
     * Gets the value of the teachers property.
     * 
     * @return
     *     possible object is
     *     {@link TeachersType }
     *     
     */
    public TeachersType getTeachers() {
        return teachers;
    }

    /**
     * Sets the value of the teachers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeachersType }
     *     
     */
    public void setTeachers(TeachersType value) {
        this.teachers = value;
    }

    /**
     * Gets the value of the subjects property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectsType }
     *     
     */
    public SubjectsType getSubjects() {
        return subjects;
    }

    /**
     * Sets the value of the subjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectsType }
     *     
     */
    public void setSubjects(SubjectsType value) {
        this.subjects = value;
    }

    /**
     * Gets the value of the classes property.
     * 
     * @return
     *     possible object is
     *     {@link ClassesType }
     *     
     */
    public ClassesType getClasses() {
        return classes;
    }

    /**
     * Sets the value of the classes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassesType }
     *     
     */
    public void setClasses(ClassesType value) {
        this.classes = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link OptionsType }
     *     
     */
    public OptionsType getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsType }
     *     
     */
    public void setOptions(OptionsType value) {
        this.options = value;
    }

    /**
     * Gets the value of the timeSlotsAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSlotsAssignmentType }
     *     
     */
    public TimeSlotsAssignmentType getTimeSlotsAssignment() {
        return timeSlotsAssignment;
    }

    /**
     * Sets the value of the timeSlotsAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSlotsAssignmentType }
     *     
     */
    public void setTimeSlotsAssignment(TimeSlotsAssignmentType value) {
        this.timeSlotsAssignment = value;
    }

}
