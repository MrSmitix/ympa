# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.ReturnDecisionDto do
  @moduledoc """
  Решения по возвратам.
  """

  @derive Jason.Encoder
  defstruct [
    :returnItemId,
    :count,
    :comment,
    :reasonType,
    :subreasonType,
    :decisionType,
    :refundAmount,
    :partnerCompensation,
    :images
  ]

  @type t :: %__MODULE__{
    :returnItemId => integer() | nil,
    :count => integer() | nil,
    :comment => String.t | nil,
    :reasonType => ПартнерскийAPIМаркета.Model.ReturnDecisionReasonType.t | nil,
    :subreasonType => ПартнерскийAPIМаркета.Model.ReturnDecisionSubreasonType.t | nil,
    :decisionType => ПартнерскийAPIМаркета.Model.ReturnDecisionType.t | nil,
    :refundAmount => integer() | nil,
    :partnerCompensation => integer() | nil,
    :images => [String.t] | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:reasonType, :struct, ПартнерскийAPIМаркета.Model.ReturnDecisionReasonType)
     |> Deserializer.deserialize(:subreasonType, :struct, ПартнерскийAPIМаркета.Model.ReturnDecisionSubreasonType)
     |> Deserializer.deserialize(:decisionType, :struct, ПартнерскийAPIМаркета.Model.ReturnDecisionType)
  end
end

