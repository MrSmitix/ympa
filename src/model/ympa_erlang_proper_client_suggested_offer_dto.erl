-module(ympa_erlang_proper_client_suggested_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_suggested_offer_dto/0]).

-export([ympa_erlang_proper_client_suggested_offer_dto/1]).

-export_type([ympa_erlang_proper_client_suggested_offer_dto/0]).

-type ympa_erlang_proper_client_suggested_offer_dto() ::
  [ {'offerId', binary() }
  | {'name', binary() }
  | {'category', binary() }
  | {'vendor', binary() }
  | {'barcodes', list(binary()) }
  | {'description', binary() }
  | {'vendorCode', binary() }
  | {'basicPrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
  ].


ympa_erlang_proper_client_suggested_offer_dto() ->
    ympa_erlang_proper_client_suggested_offer_dto([]).

ympa_erlang_proper_client_suggested_offer_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'name', binary() }
            , {'category', binary() }
            , {'vendor', binary() }
            , {'barcodes', list(binary()) }
            , {'description', binary() }
            , {'vendorCode', binary() }
            , {'basicPrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

