package controllers

import forms.bankTransferForm._
import play.api.mvc._

import scala.concurrent.Future

object CSRFController extends Controller {

  def index = Action.async {
    implicit request =>
      Future.successful(Ok(views.html.transfer(bankForm)))
  }

  def transfer = Action.async {
    implicit request =>
      bankForm.bindFromRequest.fold(
        errors => Future.successful(BadRequest(views.html.transfer(errors))),
        result => Future.successful(Ok(views.html.success(result.Account, result.Amount)))
      )
  }

}