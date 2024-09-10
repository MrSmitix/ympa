# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.ChatMessagePayloadDto do
  @moduledoc """
  Информация о приложенных к сообщению файлах.
  """

  @derive Jason.Encoder
  defstruct [
    :name,
    :url,
    :size
  ]

  @type t :: %__MODULE__{
    :name => String.t,
    :url => String.t,
    :size => integer()
  }

  def decode(value) do
    value
  end
end

