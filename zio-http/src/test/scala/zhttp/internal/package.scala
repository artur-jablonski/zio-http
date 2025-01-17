package zhttp

import zhttp.service.{ChannelFactory, EventLoopGroup, ServerChannelFactory}

package object internal {
  type HttpEnv = EventLoopGroup with ChannelFactory with DynamicServer with ServerChannelFactory
}
