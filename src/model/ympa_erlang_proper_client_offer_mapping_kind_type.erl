-module(ympa_erlang_proper_client_offer_mapping_kind_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_mapping_kind_type/0]).

-export_type([ympa_erlang_proper_client_offer_mapping_kind_type/0]).

-type ympa_erlang_proper_client_offer_mapping_kind_type() ::
  binary().

ympa_erlang_proper_client_offer_mapping_kind_type() ->
  elements([<<"ACTIVE">>, <<"ALL">>]).

