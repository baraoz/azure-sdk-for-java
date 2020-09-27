/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the configuration of the OpenShift cluster VMs.
 */
public class OpenShiftManagedClusterAgentPoolProfile {
    /**
     * Unique name of the pool profile in the context of the subscription and
     * resource group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Number of agents (VMs) to host docker containers.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /**
     * Size of agent VMs. Possible values include: 'Standard_D2s_v3',
     * 'Standard_D4s_v3', 'Standard_D8s_v3', 'Standard_D16s_v3',
     * 'Standard_D32s_v3', 'Standard_D64s_v3', 'Standard_DS4_v2',
     * 'Standard_DS5_v2', 'Standard_F8s_v2', 'Standard_F16s_v2',
     * 'Standard_F32s_v2', 'Standard_F64s_v2', 'Standard_F72s_v2',
     * 'Standard_F8s', 'Standard_F16s', 'Standard_E4s_v3', 'Standard_E8s_v3',
     * 'Standard_E16s_v3', 'Standard_E20s_v3', 'Standard_E32s_v3',
     * 'Standard_E64s_v3', 'Standard_GS2', 'Standard_GS3', 'Standard_GS4',
     * 'Standard_GS5', 'Standard_DS12_v2', 'Standard_DS13_v2',
     * 'Standard_DS14_v2', 'Standard_DS15_v2', 'Standard_L4s', 'Standard_L8s',
     * 'Standard_L16s', 'Standard_L32s'.
     */
    @JsonProperty(value = "vmSize", required = true)
    private OpenShiftContainerServiceVMSize vmSize;

    /**
     * Subnet CIDR for the peering.
     */
    @JsonProperty(value = "subnetCidr")
    private String subnetCidr;

    /**
     * OsType to be used to specify os type. Choose from Linux and Windows.
     * Default to Linux. Possible values include: 'Linux', 'Windows'.
     */
    @JsonProperty(value = "osType")
    private OSType osType;

    /**
     * Define the role of the AgentPoolProfile. Possible values include:
     * 'compute', 'infra'.
     */
    @JsonProperty(value = "role")
    private OpenShiftAgentPoolProfileRole role;

    /**
     * Get unique name of the pool profile in the context of the subscription and resource group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set unique name of the pool profile in the context of the subscription and resource group.
     *
     * @param name the name value to set
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get number of agents (VMs) to host docker containers.
     *
     * @return the count value
     */
    public int count() {
        return this.count;
    }

    /**
     * Set number of agents (VMs) to host docker containers.
     *
     * @param count the count value to set
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get size of agent VMs. Possible values include: 'Standard_D2s_v3', 'Standard_D4s_v3', 'Standard_D8s_v3', 'Standard_D16s_v3', 'Standard_D32s_v3', 'Standard_D64s_v3', 'Standard_DS4_v2', 'Standard_DS5_v2', 'Standard_F8s_v2', 'Standard_F16s_v2', 'Standard_F32s_v2', 'Standard_F64s_v2', 'Standard_F72s_v2', 'Standard_F8s', 'Standard_F16s', 'Standard_E4s_v3', 'Standard_E8s_v3', 'Standard_E16s_v3', 'Standard_E20s_v3', 'Standard_E32s_v3', 'Standard_E64s_v3', 'Standard_GS2', 'Standard_GS3', 'Standard_GS4', 'Standard_GS5', 'Standard_DS12_v2', 'Standard_DS13_v2', 'Standard_DS14_v2', 'Standard_DS15_v2', 'Standard_L4s', 'Standard_L8s', 'Standard_L16s', 'Standard_L32s'.
     *
     * @return the vmSize value
     */
    public OpenShiftContainerServiceVMSize vmSize() {
        return this.vmSize;
    }

    /**
     * Set size of agent VMs. Possible values include: 'Standard_D2s_v3', 'Standard_D4s_v3', 'Standard_D8s_v3', 'Standard_D16s_v3', 'Standard_D32s_v3', 'Standard_D64s_v3', 'Standard_DS4_v2', 'Standard_DS5_v2', 'Standard_F8s_v2', 'Standard_F16s_v2', 'Standard_F32s_v2', 'Standard_F64s_v2', 'Standard_F72s_v2', 'Standard_F8s', 'Standard_F16s', 'Standard_E4s_v3', 'Standard_E8s_v3', 'Standard_E16s_v3', 'Standard_E20s_v3', 'Standard_E32s_v3', 'Standard_E64s_v3', 'Standard_GS2', 'Standard_GS3', 'Standard_GS4', 'Standard_GS5', 'Standard_DS12_v2', 'Standard_DS13_v2', 'Standard_DS14_v2', 'Standard_DS15_v2', 'Standard_L4s', 'Standard_L8s', 'Standard_L16s', 'Standard_L32s'.
     *
     * @param vmSize the vmSize value to set
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withVmSize(OpenShiftContainerServiceVMSize vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get subnet CIDR for the peering.
     *
     * @return the subnetCidr value
     */
    public String subnetCidr() {
        return this.subnetCidr;
    }

    /**
     * Set subnet CIDR for the peering.
     *
     * @param subnetCidr the subnetCidr value to set
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * Get osType to be used to specify os type. Choose from Linux and Windows. Default to Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @return the osType value
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set osType to be used to specify os type. Choose from Linux and Windows. Default to Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @param osType the osType value to set
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get define the role of the AgentPoolProfile. Possible values include: 'compute', 'infra'.
     *
     * @return the role value
     */
    public OpenShiftAgentPoolProfileRole role() {
        return this.role;
    }

    /**
     * Set define the role of the AgentPoolProfile. Possible values include: 'compute', 'infra'.
     *
     * @param role the role value to set
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withRole(OpenShiftAgentPoolProfileRole role) {
        this.role = role;
        return this;
    }

}
