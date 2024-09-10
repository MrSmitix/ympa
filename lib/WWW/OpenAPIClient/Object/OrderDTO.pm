=begin comment

Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::Object::OrderDTO;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;

use WWW::OpenAPIClient::Object::CurrencyType;
use WWW::OpenAPIClient::Object::OrderBuyerDTO;
use WWW::OpenAPIClient::Object::OrderDeliveryDTO;
use WWW::OpenAPIClient::Object::OrderItemDTO;
use WWW::OpenAPIClient::Object::OrderPaymentMethodType;
use WWW::OpenAPIClient::Object::OrderPaymentType;
use WWW::OpenAPIClient::Object::OrderStatusType;
use WWW::OpenAPIClient::Object::OrderSubsidyDTO;
use WWW::OpenAPIClient::Object::OrderSubstatusType;
use WWW::OpenAPIClient::Object::OrderTaxSystemType;

use base ("Class::Accessor", "Class::Data::Inheritable");

#
#Заказ.
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

=begin comment

Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('openapi_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {});
__PACKAGE__->mk_classdata('class_documentation' => {});

# new plain object
sub new {
    my ($class, %args) = @_;

    my $self = bless {}, $class;

    $self->init(%args);

    return $self;
}

# initialize the object
sub init
{
    my ($self, %args) = @_;

    foreach my $attribute (keys %{$self->attribute_map}) {
        my $args_key = $self->attribute_map->{$attribute};
        $self->$attribute( $args{ $args_key } );
    }
}

# return perl hash
sub to_hash {
    my $self = shift;
    my $_hash = decode_json(JSON->new->convert_blessed->encode($self));

    return $_hash;
}

# used by JSON for serialization
sub TO_JSON {
    my $self = shift;
    my $_data = {};
    foreach my $_key (keys %{$self->attribute_map}) {
        if (defined $self->{$_key}) {
            my $_json_attribute = $self->attribute_map->{$_key};
            my $_type = $self->openapi_types->{$_key};
            my $_value = $self->{$_key};
            if ($_type =~ /^array\[(.+)\]$/i) { # array
                my $_subclass = $1;
                $_data->{$_json_attribute} =  [ map { $self->_to_json_primitives($_subclass, $_) } @$_value ];
            } elsif ($_type =~ /^hash\[string,(.+)\]$/i) { # hash
                my $_subclass = $1;
                my %_hash = ();
                while (my($_key, $_element) = each %{$_value}) {
                    $_hash{$_key} = $self->_to_json_primitives($_subclass, $_element);
                }
                $_data->{$_json_attribute} = \%_hash;
            } elsif ( grep( /^$_type$/, ('int', 'double', 'string', 'boolean', 'DATE', 'DATE_TIME'))) {
                $_data->{$_json_attribute} = $self->_to_json_primitives($_type, $_value);
            } else {
                $_data->{$_json_attribute} = $_value;
            }
        }
    }

    return $_data;
}

# to_json non-array data
sub _to_json_primitives {
    my ($self, $type, $data) = @_;
    if ( grep( /^$type$/, ('int', 'double'))) {
        # https://metacpan.org/pod/JSON#simple-scalars
        # numify it, ensuring it will be dumped as a number
        return undef unless defined $data;
        return $data + 0;
    } elsif ($type eq 'string') {
        # https://metacpan.org/pod/JSON#simple-scalars
        # stringified
        return undef unless defined $data;
        return $data . q();
    } elsif ($type eq 'boolean') {
        # https://metacpan.org/pod/JSON#JSON::true,-JSON::false,-JSON::null
        return $data ? \1 : \0;
    } elsif ($type eq 'DATE') {
        return undef unless defined $data;
        if (ref($data) eq 'DateTime') {
            # https://metacpan.org/pod/DateTime#$dt-%3Eymd($optional_separator),-$dt-%3Emdy(...),-$dt-%3Edmy(...)
            return $data->ymd;
        }
        return $data .q();
    } elsif ($type eq 'DATE_TIME') {
        return undef unless defined $data;
        # the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
        if (ref($data) eq 'DateTime') {
            # https://metacpan.org/pod/DateTime#$dt-%3Erfc3339
            return $data->rfc3339;
        }
        return $data .q();
    } else { # hash (model),  In this case, the TO_JSON of the $data object is executed
        return $data;
    }
}

# from Perl hashref
sub from_hash {
    my ($self, $hash) = @_;

    # loop through attributes and use openapi_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->openapi_types} ) {
        my $_json_attribute = $self->attribute_map->{$_key};
        if ($_type =~ /^array\[(.+)\]$/i) { # array
            my $_subclass = $1;
            my @_array = ();
            foreach my $_element (@{$hash->{$_json_attribute}}) {
                push @_array, $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \@_array;
        } elsif ($_type =~ /^hash\[string,(.+)\]$/i) { # hash
            my $_subclass = $1;
            my %_hash = ();
            while (my($_key, $_element) = each %{$hash->{$_json_attribute}}) {
                $_hash{$_key} = $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \%_hash;
        } elsif (exists $hash->{$_json_attribute}) { #hash(model), primitive, datetime
            $self->{$_key} = $self->_deserialize($_type, $hash->{$_json_attribute});
        } else {
            $log->debugf("Warning: %s (%s) does not exist in input hash\n", $_key, $_json_attribute);
        }
    }

    return $self;
}

# deserialize non-array data
sub _deserialize {
    my ($self, $type, $data) = @_;
    $log->debugf("deserializing %s with %s",Dumper($data), $type);

    if (grep( /^$type$/ , ('DATE_TIME', 'DATE'))) {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double'))) {
        return undef unless defined $data;
        return $data + 0;
    } elsif ($type eq 'string') {
        return undef unless defined $data;
        return $data . q();
    } elsif ($type eq 'boolean') {
        return !!$data;
    } else { # hash(model)
        my $_instance = eval "WWW::OpenAPIClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}


__PACKAGE__->class_documentation({description => 'Заказ.',
                                  class => 'OrderDTO',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'id' => {
        datatype => 'int',
        base_name => 'id',
        description => 'Идентификатор заказа.',
        format => '',
        read_only => '',
            },
    'status' => {
        datatype => 'OrderStatusType',
        base_name => 'status',
        description => '',
        format => '',
        read_only => '',
            },
    'substatus' => {
        datatype => 'OrderSubstatusType',
        base_name => 'substatus',
        description => '',
        format => '',
        read_only => '',
            },
    'creation_date' => {
        datatype => 'string',
        base_name => 'creationDate',
        description => '',
        format => '',
        read_only => '',
            },
    'updated_at' => {
        datatype => 'string',
        base_name => 'updatedAt',
        description => '',
        format => '',
        read_only => '',
            },
    'currency' => {
        datatype => 'CurrencyType',
        base_name => 'currency',
        description => '',
        format => '',
        read_only => '',
            },
    'items_total' => {
        datatype => 'double',
        base_name => 'itemsTotal',
        description => 'Платеж покупателя. ',
        format => '',
        read_only => '',
            },
    'delivery_total' => {
        datatype => 'double',
        base_name => 'deliveryTotal',
        description => 'Стоимость доставки. ',
        format => '',
        read_only => '',
            },
    'buyer_items_total' => {
        datatype => 'double',
        base_name => 'buyerItemsTotal',
        description => '{% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. ',
        format => '',
        read_only => '',
            },
    'buyer_total' => {
        datatype => 'double',
        base_name => 'buyerTotal',
        description => '{% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. ',
        format => '',
        read_only => '',
            },
    'buyer_items_total_before_discount' => {
        datatype => 'double',
        base_name => 'buyerItemsTotalBeforeDiscount',
        description => 'Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. ',
        format => '',
        read_only => '',
            },
    'buyer_total_before_discount' => {
        datatype => 'double',
        base_name => 'buyerTotalBeforeDiscount',
        description => '{% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки). ',
        format => '',
        read_only => '',
            },
    'payment_type' => {
        datatype => 'OrderPaymentType',
        base_name => 'paymentType',
        description => '',
        format => '',
        read_only => '',
            },
    'payment_method' => {
        datatype => 'OrderPaymentMethodType',
        base_name => 'paymentMethod',
        description => '',
        format => '',
        read_only => '',
            },
    'fake' => {
        datatype => 'boolean',
        base_name => 'fake',
        description => 'Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ',
        format => '',
        read_only => '',
            },
    'items' => {
        datatype => 'ARRAY[OrderItemDTO]',
        base_name => 'items',
        description => 'Список товаров в заказе.',
        format => '',
        read_only => '',
            },
    'subsidies' => {
        datatype => 'ARRAY[OrderSubsidyDTO]',
        base_name => 'subsidies',
        description => 'Список субсидий по типам.',
        format => '',
        read_only => '',
            },
    'delivery' => {
        datatype => 'OrderDeliveryDTO',
        base_name => 'delivery',
        description => '',
        format => '',
        read_only => '',
            },
    'buyer' => {
        datatype => 'OrderBuyerDTO',
        base_name => 'buyer',
        description => '',
        format => '',
        read_only => '',
            },
    'notes' => {
        datatype => 'string',
        base_name => 'notes',
        description => 'Комментарий к заказу.',
        format => '',
        read_only => '',
            },
    'tax_system' => {
        datatype => 'OrderTaxSystemType',
        base_name => 'taxSystem',
        description => '',
        format => '',
        read_only => '',
            },
    'cancel_requested' => {
        datatype => 'boolean',
        base_name => 'cancelRequested',
        description => '**Только для модели DBS**  Запрошена ли отмена. ',
        format => '',
        read_only => '',
            },
    'expiry_date' => {
        datatype => 'string',
        base_name => 'expiryDate',
        description => '',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
    'id' => 'int',
    'status' => 'OrderStatusType',
    'substatus' => 'OrderSubstatusType',
    'creation_date' => 'string',
    'updated_at' => 'string',
    'currency' => 'CurrencyType',
    'items_total' => 'double',
    'delivery_total' => 'double',
    'buyer_items_total' => 'double',
    'buyer_total' => 'double',
    'buyer_items_total_before_discount' => 'double',
    'buyer_total_before_discount' => 'double',
    'payment_type' => 'OrderPaymentType',
    'payment_method' => 'OrderPaymentMethodType',
    'fake' => 'boolean',
    'items' => 'ARRAY[OrderItemDTO]',
    'subsidies' => 'ARRAY[OrderSubsidyDTO]',
    'delivery' => 'OrderDeliveryDTO',
    'buyer' => 'OrderBuyerDTO',
    'notes' => 'string',
    'tax_system' => 'OrderTaxSystemType',
    'cancel_requested' => 'boolean',
    'expiry_date' => 'string'
} );

__PACKAGE__->attribute_map( {
    'id' => 'id',
    'status' => 'status',
    'substatus' => 'substatus',
    'creation_date' => 'creationDate',
    'updated_at' => 'updatedAt',
    'currency' => 'currency',
    'items_total' => 'itemsTotal',
    'delivery_total' => 'deliveryTotal',
    'buyer_items_total' => 'buyerItemsTotal',
    'buyer_total' => 'buyerTotal',
    'buyer_items_total_before_discount' => 'buyerItemsTotalBeforeDiscount',
    'buyer_total_before_discount' => 'buyerTotalBeforeDiscount',
    'payment_type' => 'paymentType',
    'payment_method' => 'paymentMethod',
    'fake' => 'fake',
    'items' => 'items',
    'subsidies' => 'subsidies',
    'delivery' => 'delivery',
    'buyer' => 'buyer',
    'notes' => 'notes',
    'tax_system' => 'taxSystem',
    'cancel_requested' => 'cancelRequested',
    'expiry_date' => 'expiryDate'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
