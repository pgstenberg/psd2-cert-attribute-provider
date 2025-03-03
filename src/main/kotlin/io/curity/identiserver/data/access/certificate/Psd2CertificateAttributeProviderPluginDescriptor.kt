/*
 *  Copyright 2019 Curity AB
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.curity.identiserver.data.access.certificate

import se.curity.identityserver.sdk.plugin.descriptor.DataAccessProviderPluginDescriptor
import se.curity.identityserver.sdk.datasource.AttributeDataAccessProvider

class Psd2CertificateAttributeProviderPluginDescriptor :
        DataAccessProviderPluginDescriptor<Psd2CertificateAttributeProviderConfiguration> {

    override fun getPluginImplementationType(): String {
        return Psd2CertificateAttributeProvider::class.java.typeName
    }

    override fun getConfigurationType(): Class<Psd2CertificateAttributeProviderConfiguration> {
        return Psd2CertificateAttributeProviderConfiguration::class.java
    }

    override fun getAttributeDataAccessProvider(): Class<out AttributeDataAccessProvider> {
        return Psd2CertificateAttributeProvider::class.java
    }
}
