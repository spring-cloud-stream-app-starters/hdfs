/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.stream.app.hdfs.hadoop.config.common.annotation.configurers;

import java.util.Map;
import java.util.Properties;

import org.springframework.cloud.stream.app.hdfs.hadoop.config.common.annotation.AnnotationConfigurerBuilder;

/**
 * Interface for {@link DefaultPropertiesConfigurer} which act
 * as intermediate gatekeeper between a user and
 * an {@link org.springframework.cloud.stream.app.hdfs.hadoop.config.common.annotation.AnnotationConfigurer}.
 *
 * @author Janne Valkealahti
 *
 * @param <I> configurer type
 */
public interface PropertiesConfigurer<I> extends AnnotationConfigurerBuilder<I> {

	PropertiesConfigurer<I> properties(Properties properties);

	PropertiesConfigurer<I> properties(Map<String, String> properties);

	PropertiesConfigurer<I> property(String key, String value);

}
