//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.16 at 03:37:07 PM CDT 
//


package org.example.skills;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bowling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bowling">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/skills}skill">
 *       &lt;sequence>
 *         &lt;element name="bowlingAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bowlingSpeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bowling", propOrder = {
    "bowlingAvg",
    "bowlingSpeed"
})
public class Bowling
    extends Skill
{

    protected String bowlingAvg;
    protected String bowlingSpeed;

    /**
     * Gets the value of the bowlingAvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBowlingAvg() {
        return bowlingAvg;
    }

    /**
     * Sets the value of the bowlingAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBowlingAvg(String value) {
        this.bowlingAvg = value;
    }

    /**
     * Gets the value of the bowlingSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBowlingSpeed() {
        return bowlingSpeed;
    }

    /**
     * Sets the value of the bowlingSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBowlingSpeed(String value) {
        this.bowlingSpeed = value;
    }

}
