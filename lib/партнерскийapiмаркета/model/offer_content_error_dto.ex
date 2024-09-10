# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.OfferContentErrorDto do
  @moduledoc """
  Текст ошибки.
  """

  @derive Jason.Encoder
  defstruct [
    :type,
    :parameterId,
    :message
  ]

  @type t :: %__MODULE__{
    :type => ПартнерскийAPIМаркета.Model.OfferContentErrorType.t,
    :parameterId => integer() | nil,
    :message => String.t
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:type, :struct, ПартнерскийAPIМаркета.Model.OfferContentErrorType)
  end
end

