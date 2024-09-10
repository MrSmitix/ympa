-module(ympa_erlang_proper_client_base_campaign_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_base_campaign_offer_dto/0]).

-export([ympa_erlang_proper_client_base_campaign_offer_dto/1]).

-export_type([ympa_erlang_proper_client_base_campaign_offer_dto/0]).

-type ympa_erlang_proper_client_base_campaign_offer_dto() ::
  [ {'offerId', binary() }
  | {'quantum', ympa_erlang_proper_client_quantum_dto:ympa_erlang_proper_client_quantum_dto() }
  | {'available', boolean() }
  ].


ympa_erlang_proper_client_base_campaign_offer_dto() ->
    ympa_erlang_proper_client_base_campaign_offer_dto([]).

ympa_erlang_proper_client_base_campaign_offer_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'quantum', ympa_erlang_proper_client_quantum_dto:ympa_erlang_proper_client_quantum_dto() }
            , {'available', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

