/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Details about app recovery operation.
 */
@JsonFlatten
public class SnapshotRestoreRequest extends ProxyOnlyResource {
    /**
     * Point in time in which the app restore should be done, formatted as a
     * DateTime string.
     */
    @JsonProperty(value = "properties.snapshotTime")
    private String snapshotTime;

    /**
     * Optional. Specifies the web app that snapshot contents will be retrieved
     * from.
     * If empty, the targeted web app will be used as the source.
     */
    @JsonProperty(value = "properties.recoverySource")
    private SnapshotRecoverySource recoverySource;

    /**
     * If &lt;code&gt;true&lt;/code&gt; the restore operation can overwrite
     * source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.overwrite", required = true)
    private boolean overwrite;

    /**
     * If true, site configuration, in addition to content, will be reverted.
     */
    @JsonProperty(value = "properties.recoverConfiguration")
    private Boolean recoverConfiguration;

    /**
     * If true, custom hostname conflicts will be ignored when recovering to a
     * target web app.
     * This setting is only necessary when RecoverConfiguration is enabled.
     */
    @JsonProperty(value = "properties.ignoreConflictingHostNames")
    private Boolean ignoreConflictingHostNames;

    /**
     * If true, the snapshot is retrieved from DRSecondary endpoint.
     */
    @JsonProperty(value = "properties.useDRSecondary")
    private Boolean useDRSecondary;

    /**
     * Get point in time in which the app restore should be done, formatted as a DateTime string.
     *
     * @return the snapshotTime value
     */
    public String snapshotTime() {
        return this.snapshotTime;
    }

    /**
     * Set point in time in which the app restore should be done, formatted as a DateTime string.
     *
     * @param snapshotTime the snapshotTime value to set
     * @return the SnapshotRestoreRequest object itself.
     */
    public SnapshotRestoreRequest withSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
        return this;
    }

    /**
     * Get optional. Specifies the web app that snapshot contents will be retrieved from.
     If empty, the targeted web app will be used as the source.
     *
     * @return the recoverySource value
     */
    public SnapshotRecoverySource recoverySource() {
        return this.recoverySource;
    }

    /**
     * Set optional. Specifies the web app that snapshot contents will be retrieved from.
     If empty, the targeted web app will be used as the source.
     *
     * @param recoverySource the recoverySource value to set
     * @return the SnapshotRestoreRequest object itself.
     */
    public SnapshotRestoreRequest withRecoverySource(SnapshotRecoverySource recoverySource) {
        this.recoverySource = recoverySource;
        return this;
    }

    /**
     * Get if &lt;code&gt;true&lt;/code&gt; the restore operation can overwrite source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the overwrite value
     */
    public boolean overwrite() {
        return this.overwrite;
    }

    /**
     * Set if &lt;code&gt;true&lt;/code&gt; the restore operation can overwrite source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param overwrite the overwrite value to set
     * @return the SnapshotRestoreRequest object itself.
     */
    public SnapshotRestoreRequest withOverwrite(boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * Get if true, site configuration, in addition to content, will be reverted.
     *
     * @return the recoverConfiguration value
     */
    public Boolean recoverConfiguration() {
        return this.recoverConfiguration;
    }

    /**
     * Set if true, site configuration, in addition to content, will be reverted.
     *
     * @param recoverConfiguration the recoverConfiguration value to set
     * @return the SnapshotRestoreRequest object itself.
     */
    public SnapshotRestoreRequest withRecoverConfiguration(Boolean recoverConfiguration) {
        this.recoverConfiguration = recoverConfiguration;
        return this;
    }

    /**
     * Get if true, custom hostname conflicts will be ignored when recovering to a target web app.
     This setting is only necessary when RecoverConfiguration is enabled.
     *
     * @return the ignoreConflictingHostNames value
     */
    public Boolean ignoreConflictingHostNames() {
        return this.ignoreConflictingHostNames;
    }

    /**
     * Set if true, custom hostname conflicts will be ignored when recovering to a target web app.
     This setting is only necessary when RecoverConfiguration is enabled.
     *
     * @param ignoreConflictingHostNames the ignoreConflictingHostNames value to set
     * @return the SnapshotRestoreRequest object itself.
     */
    public SnapshotRestoreRequest withIgnoreConflictingHostNames(Boolean ignoreConflictingHostNames) {
        this.ignoreConflictingHostNames = ignoreConflictingHostNames;
        return this;
    }

    /**
     * Get if true, the snapshot is retrieved from DRSecondary endpoint.
     *
     * @return the useDRSecondary value
     */
    public Boolean useDRSecondary() {
        return this.useDRSecondary;
    }

    /**
     * Set if true, the snapshot is retrieved from DRSecondary endpoint.
     *
     * @param useDRSecondary the useDRSecondary value to set
     * @return the SnapshotRestoreRequest object itself.
     */
    public SnapshotRestoreRequest withUseDRSecondary(Boolean useDRSecondary) {
        this.useDRSecondary = useDRSecondary;
        return this;
    }

}
