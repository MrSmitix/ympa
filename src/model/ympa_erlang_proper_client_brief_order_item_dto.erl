-module(ympa_erlang_proper_client_brief_order_item_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_brief_order_item_dto/0]).

-export([ympa_erlang_proper_client_brief_order_item_dto/1]).

-export_type([ympa_erlang_proper_client_brief_order_item_dto/0]).

-type ympa_erlang_proper_client_brief_order_item_dto() ::
  [ {'id', integer() }
  | {'vat', ympa_erlang_proper_client_order_vat_type:ympa_erlang_proper_client_order_vat_type() }
  | {'count', integer() }
  | {'price', integer() }
  | {'offerName', binary() }
  | {'offerId', binary() }
  | {'instances', list(ympa_erlang_proper_client_order_item_instance_dto:ympa_erlang_proper_client_order_item_instance_dto()) }
  ].


ympa_erlang_proper_client_brief_order_item_dto() ->
    ympa_erlang_proper_client_brief_order_item_dto([]).

ympa_erlang_proper_client_brief_order_item_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'vat', ympa_erlang_proper_client_order_vat_type:ympa_erlang_proper_client_order_vat_type() }
            , {'count', integer() }
            , {'price', integer() }
            , {'offerName', binary() }
            , {'offerId', binary(1, 255) }
            , {'instances', list(ympa_erlang_proper_client_order_item_instance_dto:ympa_erlang_proper_client_order_item_instance_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

