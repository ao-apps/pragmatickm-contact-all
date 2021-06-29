/*
 * pragmatickm-contact-all - Convenience POM to include most PragmaticKM Contact features, not including documentation or examples.
 * Copyright (C) 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of pragmatickm-contact-all.
 *
 * pragmatickm-contact-all is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * pragmatickm-contact-all is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with pragmatickm-contact-all.  If not, see <http://www.gnu.org/licenses/>.
 */
module com.pragmatickm.contact.all {
	// Direct
	requires transitive com.pragmatickm.contact.model; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-model</artifactId>
	requires transitive com.pragmatickm.contact.servlet; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-servlet</artifactId>
	requires transitive com.pragmatickm.contact.taglib; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-taglib</artifactId>
}
