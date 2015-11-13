## PxAPI
PxAPI is a library that provides convinient access to the 500px.com from a java apps.
Please, read [developer guide](http://developers.500px.com) from 500px team to understand all opportunities and limites.

Also, you need to know how do OAuth2 work. I suggest to read [this article](http://hueniverse.com/oauth/)

I have not written documentation yet, but you can checkout test cases - there are few examples.

## Requirements
 - google-gson
 - signpost-core

These two libs are required. `google-gson` to parse api responses and `signpost-common` to sign oauth requests.
It's your concern to get access token and token secret or consumer secret from the 500px.

## How to use
If you use maven it's simple to resolve requred libraries. Just add the next lines to your dependencies.

	<dependencies>
		<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
			<version>2.2.1</version>
		</dependency>
		<dependency>
			<groupId>oauth.signpost</groupId>
			<artifactId>signpost-core</artifactId>
			<version>1.2</version>
			<scope>compile</scope>
		</dependency>
	</dependencies>

Add pxapi.jar to your classpath.

## TODO
 - add a short examples 
 - add wiki

## License
Copyright (c) 2011 by Aliaksandr Chaiko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
