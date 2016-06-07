package eu.inn.authentication

import eu.inn.binders.value.Value

case class AuthUser(id: String, roles: Set[String], properties: Value)