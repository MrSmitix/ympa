-module(ympa_erlang_proper_client_offer_mapping_entry_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_mapping_entry_dto/0]).

-export([ympa_erlang_proper_client_offer_mapping_entry_dto/1]).

-export_type([ympa_erlang_proper_client_offer_mapping_entry_dto/0]).

-type ympa_erlang_proper_client_offer_mapping_entry_dto() ::
  [ {'mapping', ympa_erlang_proper_client_offer_mapping_dto:ympa_erlang_proper_client_offer_mapping_dto() }
  | {'awaitingModerationMapping', ympa_erlang_proper_client_offer_mapping_dto:ympa_erlang_proper_client_offer_mapping_dto() }
  | {'rejectedMapping', ympa_erlang_proper_client_offer_mapping_dto:ympa_erlang_proper_client_offer_mapping_dto() }
  | {'offer', ympa_erlang_proper_client_mappings_offer_dto:ympa_erlang_proper_client_mappings_offer_dto() }
  ].


ympa_erlang_proper_client_offer_mapping_entry_dto() ->
    ympa_erlang_proper_client_offer_mapping_entry_dto([]).

ympa_erlang_proper_client_offer_mapping_entry_dto(Fields) ->
  Default = [ {'mapping', ympa_erlang_proper_client_offer_mapping_dto:ympa_erlang_proper_client_offer_mapping_dto() }
            , {'awaitingModerationMapping', ympa_erlang_proper_client_offer_mapping_dto:ympa_erlang_proper_client_offer_mapping_dto() }
            , {'rejectedMapping', ympa_erlang_proper_client_offer_mapping_dto:ympa_erlang_proper_client_offer_mapping_dto() }
            , {'offer', ympa_erlang_proper_client_mappings_offer_dto:ympa_erlang_proper_client_mappings_offer_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

