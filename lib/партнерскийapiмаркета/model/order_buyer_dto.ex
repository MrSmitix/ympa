# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.OrderBuyerDto do
  @moduledoc """
  Информация о покупателе.  Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS. 
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :lastName,
    :firstName,
    :middleName,
    :type
  ]

  @type t :: %__MODULE__{
    :id => String.t | nil,
    :lastName => String.t | nil,
    :firstName => String.t | nil,
    :middleName => String.t | nil,
    :type => ПартнерскийAPIМаркета.Model.OrderBuyerType.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:type, :struct, ПартнерскийAPIМаркета.Model.OrderBuyerType)
  end
end

