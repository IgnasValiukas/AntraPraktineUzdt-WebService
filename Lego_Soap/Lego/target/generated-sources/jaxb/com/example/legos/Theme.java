//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.26 at 06:45:30 PM EEST 
//


package com.example.legos;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for theme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="theme"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Marvel"/&gt;
 *     &lt;enumeration value="StarWars"/&gt;
 *     &lt;enumeration value="DC"/&gt;
 *     &lt;enumeration value="Minecraft"/&gt;
 *     &lt;enumeration value="Technic"/&gt;
 *     &lt;enumeration value="Architecture"/&gt;
 *     &lt;enumeration value="Ninjago"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "theme")
@XmlEnum
public enum Theme {

    @XmlEnumValue("Marvel")
    MARVEL("Marvel"),
    @XmlEnumValue("StarWars")
    STAR_WARS("StarWars"),
    DC("DC"),
    @XmlEnumValue("Minecraft")
    MINECRAFT("Minecraft"),
    @XmlEnumValue("Technic")
    TECHNIC("Technic"),
    @XmlEnumValue("Architecture")
    ARCHITECTURE("Architecture"),
    @XmlEnumValue("Ninjago")
    NINJAGO("Ninjago");
    private final String value;

    Theme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Theme fromValue(String v) {
        for (Theme c: Theme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}