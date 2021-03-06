/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01.implementation;

import com.microsoft.azure.management.databoxedge.v2019_08_01.AsymmetricEncryptedSecret;
import java.util.List;
import com.microsoft.azure.management.databoxedge.v2019_08_01.ShareAccessRight;
import com.microsoft.azure.management.databoxedge.v2019_08_01.UserType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.databoxedge.v2019_08_01.ARMBaseModel;

/**
 * Represents a user who has access to one or more shares on the Data Box
 * Edge/Gateway device.
 */
@JsonFlatten
public class UserInner extends ARMBaseModel {
    /**
     * The password details.
     */
    @JsonProperty(value = "properties.encryptedPassword")
    private AsymmetricEncryptedSecret encryptedPassword;

    /**
     * List of shares that the user has rights on. This field should not be
     * specified during user creation.
     */
    @JsonProperty(value = "properties.shareAccessRights")
    private List<ShareAccessRight> shareAccessRights;

    /**
     * Type of the user. Possible values include: 'Share', 'LocalManagement',
     * 'ARM'.
     */
    @JsonProperty(value = "properties.userType", required = true)
    private UserType userType;

    /**
     * Get the password details.
     *
     * @return the encryptedPassword value
     */
    public AsymmetricEncryptedSecret encryptedPassword() {
        return this.encryptedPassword;
    }

    /**
     * Set the password details.
     *
     * @param encryptedPassword the encryptedPassword value to set
     * @return the UserInner object itself.
     */
    public UserInner withEncryptedPassword(AsymmetricEncryptedSecret encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
        return this;
    }

    /**
     * Get list of shares that the user has rights on. This field should not be specified during user creation.
     *
     * @return the shareAccessRights value
     */
    public List<ShareAccessRight> shareAccessRights() {
        return this.shareAccessRights;
    }

    /**
     * Set list of shares that the user has rights on. This field should not be specified during user creation.
     *
     * @param shareAccessRights the shareAccessRights value to set
     * @return the UserInner object itself.
     */
    public UserInner withShareAccessRights(List<ShareAccessRight> shareAccessRights) {
        this.shareAccessRights = shareAccessRights;
        return this;
    }

    /**
     * Get type of the user. Possible values include: 'Share', 'LocalManagement', 'ARM'.
     *
     * @return the userType value
     */
    public UserType userType() {
        return this.userType;
    }

    /**
     * Set type of the user. Possible values include: 'Share', 'LocalManagement', 'ARM'.
     *
     * @param userType the userType value to set
     * @return the UserInner object itself.
     */
    public UserInner withUserType(UserType userType) {
        this.userType = userType;
        return this;
    }

}
