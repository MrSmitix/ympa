# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.GetChatHistoryRequest do
  @moduledoc """
  Историю какого чата нужно получить — и начиная с какого сообщения. 
  """

  @derive Jason.Encoder
  defstruct [
    :messageIdFrom
  ]

  @type t :: %__MODULE__{
    :messageIdFrom => integer() | nil
  }

  def decode(value) do
    value
  end
end

