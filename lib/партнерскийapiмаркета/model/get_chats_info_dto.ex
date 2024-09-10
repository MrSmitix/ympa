# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.GetChatsInfoDto do
  @moduledoc """
  Список чатов.
  """

  @derive Jason.Encoder
  defstruct [
    :chats,
    :paging
  ]

  @type t :: %__MODULE__{
    :chats => [ПартнерскийAPIМаркета.Model.GetChatInfoDto.t],
    :paging => ПартнерскийAPIМаркета.Model.ForwardScrollingPagerDto.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:chats, :list, ПартнерскийAPIМаркета.Model.GetChatInfoDto)
     |> Deserializer.deserialize(:paging, :struct, ПартнерскийAPIМаркета.Model.ForwardScrollingPagerDto)
  end
end

