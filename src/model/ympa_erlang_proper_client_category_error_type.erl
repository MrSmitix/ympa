-module(ympa_erlang_proper_client_category_error_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_category_error_type/0]).

-export_type([ympa_erlang_proper_client_category_error_type/0]).

-type ympa_erlang_proper_client_category_error_type() ::
  binary().

ympa_erlang_proper_client_category_error_type() ->
  elements([<<"UNKNOWN_CATEGORY">>, <<"CATEGORY_IS_NOT_LEAF">>]).

