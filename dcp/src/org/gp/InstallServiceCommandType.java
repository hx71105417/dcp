
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This Service Command requests the loading and installation of the service components, as defined by the AP, into the mobile equipment. For example:
 * - SD creation and keys management on the SE,
 * - Loading of the SE applications,
 * - Instantiation of the SE applications (installation, extradition),
 * - Loading and installation of the Device applications.
 * The list of actions to be performed is service dependent and is defined as a business agreement with the AP.
 * 
 * <p>Java class for InstallServiceCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallServiceCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceCommandType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallServiceCommandType")
public class InstallServiceCommandType
    extends ServiceCommandType
{


}
