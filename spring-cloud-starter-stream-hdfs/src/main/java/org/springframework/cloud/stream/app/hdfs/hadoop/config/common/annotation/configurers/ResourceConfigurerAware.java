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

import java.util.Set;

import org.springframework.cloud.stream.app.hdfs.hadoop.config.common.annotation.AnnotationBuilder;
import org.springframework.core.io.Resource;

/**
 * Interface for {@link AnnotationBuilder} which wants to be
 * aware of {@link Resource}s configured by {@link DefaultResourceConfigurer}.
 *
 * @author Janne Valkealahti
 *
 */
public interface ResourceConfigurerAware {

	/**
	 * Configure {@link Resource}s.
	 *
	 * @param resources the resources
	 */
	void configureResources(Set<Resource> resources);

}
