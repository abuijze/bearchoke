/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bearchoke.platform.api.todo.identifier;

import org.axonframework.common.Assert;
import org.axonframework.domain.IdentifierFactory;

import java.io.Serializable;

/**
 * Created by Bjorn Harvold
 * Date: 10/11/14
 * Time: 5:23 PM
 * Responsibility:
 */
public class ToDoIdentifier implements Serializable {
    private static final long serialVersionUID = -925210535511442453L;
    private String identifier;


    public ToDoIdentifier() {
        this.identifier = IdentifierFactory.getInstance().generateIdentifier();
    }

    public ToDoIdentifier(String identifier) {
        Assert.notNull(identifier, "Identifier may not be null");
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDoIdentifier id = (ToDoIdentifier) o;

        return identifier.equals(id.identifier);

    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    @Override
    public String toString() {
        return identifier;
    }

}
