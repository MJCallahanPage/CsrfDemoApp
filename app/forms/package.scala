package forms

import models.bankModel
import play.api.data.Forms._
import play.api.data._
import play.api.data.format.Formats._

object bankTransferForm {

  val bankForm = Form(
    mapping(
      "Account" -> number,
      "Amount" -> of[Double]
    )
      /* apply */ ((Account, Amount) => bankModel(Account, Amount))
      /* unapply */ ((transferDetails: bankModel) =>
      Some(
        (
          transferDetails.Account,
          transferDetails.Amount
          )))
  )
}