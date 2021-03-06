/*
 * Copyright (C) 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.fortsoft.matilda.dao;

import ro.fortsoft.dada.core.Entity;
import ro.fortsoft.dada.iciql.IciqlDbFactory;
import ro.fortsoft.dada.iciql.IciqlEntityDao;
import ro.fortsoft.matilda.util.DbUtils;

/**
 * @author Decebal Suiu
 */
public class IciqlDao<T extends Entity> extends IciqlEntityDao<T> {

    public IciqlDao() {
        this(DbUtils::getDb);
    }

    public IciqlDao(IciqlDbFactory dbFactory) {
        super(dbFactory);
    }

}
