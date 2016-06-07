package eu.inn.authentication

import eu.inn.hyperbus.model._
import eu.inn.hyperbus.model.annotations.{body, request, response}

@body("application/vnd.auth+json")
case class AuthenticationRequestBody(credentials: String) extends Body

@body("application/vnd.auth-user+json")
case class AuthenticationResponseBody(authUser: AuthUser) extends Body

@request(Method.GET, "/auth")
case class AuthenticationRequest(body: AuthenticationRequestBody) extends Request[AuthenticationRequestBody]

@response(Status.OK)
case class AuthenticationResponse[+B <: AuthenticationResponseBody](body: B) extends NormalResponse with Response[B]
