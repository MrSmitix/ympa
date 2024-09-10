-module(ympa_erlang_proper_client_order_business_buyer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_business_buyer_dto/0]).

-export([ympa_erlang_proper_client_order_business_buyer_dto/1]).

-export_type([ympa_erlang_proper_client_order_business_buyer_dto/0]).

-type ympa_erlang_proper_client_order_business_buyer_dto() ::
  [ {'inn', binary() }
  | {'kpp', binary() }
  | {'organizationName', binary() }
  | {'organizationJurAddress', binary() }
  ].


ympa_erlang_proper_client_order_business_buyer_dto() ->
    ympa_erlang_proper_client_order_business_buyer_dto([]).

ympa_erlang_proper_client_order_business_buyer_dto(Fields) ->
  Default = [ {'inn', binary() }
            , {'kpp', binary() }
            , {'organizationName', binary() }
            , {'organizationJurAddress', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

